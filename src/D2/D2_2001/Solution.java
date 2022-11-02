package D2.D2_2001;/////////////////////////////////////////////////////////////////////////////////////////////


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
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            int max=0;
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<N;j++){
                    arr[i][j]= Integer.parseInt(st.nextToken());
                }
            }
            //N 5
            //M 2


            for(int i=0;i<=N-M;i++){
                for(int j=0;j<=N-M;j++){

                    int sum=0;
                    for(int k=i;k<i+M;k++){
                        for(int w=j;w<j+M;w++){
                            sum+=arr[k][w];
                        }
                    }
                    if(sum>max){
                        max=sum;
                    }
                }
            }

           sb.append(max+"\n");

        }
        System.out.println(sb);



    }
}


