package D2.D2_2005;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+"\n");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];

            for(int i=0;i<N;i++){
                for(int j=0; j<=i;j++){
                    if(i ==0 && j==0){
                        arr[i][j] = 1;
                        continue;
                    }

                    if(j>0 && i>0){
                        arr[i][j] += arr[i-1][j-1];
                        arr[i][j] += arr[i-1][j];
                    }else{
                        arr[i][j] += arr[i-1][j];
                    }

                }
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(arr[i][j] !=0 ) sb.append(arr[i][j]+" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);



    }
}


