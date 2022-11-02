package D2.D2_1859;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            long sum =0;
            long[] arr = new long[N];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            long max = arr[N-1];
            for(int i=N-2;i>=0;i--){
                if(max<arr[i]){
                    max= arr[i];
                }else{
                    sum += (max-arr[i]);
                }

            }
            sb.append(sum+"\n");

        }
        System.out.println(sb);



    }
}


