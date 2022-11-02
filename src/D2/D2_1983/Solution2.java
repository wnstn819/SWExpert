package D2.D2_1983;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution2 {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            double[] arr = new double[N];
            int count =0;
            for(int i=0;i<N;i++){
                st= new StringTokenizer(br.readLine());

                arr[i] = Double.parseDouble(st.nextToken())*0.35 + Double.parseDouble(st.nextToken())*0.45 + Double.parseDouble(st.nextToken())*0.20;;

                if(i>K-1 && arr[i]>arr[K-1]) count++;
            }
            for (int j = 0; j < K-1; j++) if(arr[j]>arr[K-1]) count++;

            switch (count/(N/10)){
                case 0: sb.append("A+\n"); break;
                case 1: sb.append("A0\n"); break;
                case 2: sb.append("A-\n"); break;
                case 3: sb.append("B+\n"); break;
                case 4: sb.append("B0\n"); break;
                case 5: sb.append("B-\n"); break;
                case 6: sb.append("C+\n"); break;
                case 7: sb.append("C0\n"); break;
                case 8: sb.append("C-\n"); break;
                case 9: sb.append("D0\n"); break;

            }

        }
        System.out.println(sb);



    }
}


