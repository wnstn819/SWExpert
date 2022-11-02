package D2.D2_1983;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution1 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());
        String[] str = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase);
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            double[] arr = new double[N];
            int count =0;
            for(int i=0;i<N;i++){
                st= new StringTokenizer(br.readLine());
                double score = Double.parseDouble(st.nextToken())*0.35 + Double.parseDouble(st.nextToken())*0.45 + Double.parseDouble(st.nextToken())*0.20;
                arr[i] = score;
            }
            for(int i=0;i<N;i++) {
                if (arr[i] > arr[K - 1]) {
                    count++;
                }
            }
            sb.append(" ").append(str[count/(N/10)]).append("\n");


        }
        System.out.println(sb.toString());



    }
}


