package D2.D2_1979;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static StringBuilder sb = new StringBuilder();
    public static void sol(int[][] arr,int N, int K){
        int result=0;
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                int rCount =0;
                int bCount =0;
                if(arr[j][k] == 1){
                    for(int z = k;z<N;z++) {
                        if (arr[j][z] == 1) {
                            rCount++;
                        }
                        else{
                            break;
                        }
                    }
                    for(int z = k-1;z>=0;z--){
                        if (arr[j][z] == 1) {
                            rCount=0;
                        }
                        else{
                            break;
                        }
                    }


                    for(int z=j;z<N;z++){


                        if(arr[z][k] == 1){
                            bCount++;
                        }else{
                            break;
                        }
                    }

                    for(int z=j-1;z>=0;z--){


                        if(arr[z][k] == 1){
                            bCount=0;
                        }else{
                            break;
                        }
                    }

                }
                if(rCount == K){

                    result++;
                }
                if(bCount == K){

                    result++;
                }
            }

        }
        sb.append(" ").append(result).append("\n");


    }




    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T;i++) {
            sb.append("#"+(i+1));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < N; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }

            }
            sol(arr,N,K);




        }
        System.out.println(sb.toString());



    }
}


