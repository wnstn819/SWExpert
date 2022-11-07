package D3.D3_13038;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    static long Sol(int[] arr, int n ) {
        long result =0;
        long count =0;
        while(count < n){

            for(int i=0;i<7;i++){
                result++;
                if(arr[i] == 1){
                    count++;

                    if(count ==n){
                        return result;
                    }
                }

            }
        }



        return result;

    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1;testCase<=T;testCase++){
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[7];
            int[] resultArr = new int[7];
            int count =0;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<7;i++){
                arr[i]= Integer.parseInt(st.nextToken());
                if(arr[i] == 1){
                    count++;
                }
            }


            int min = 7;
            for(int i=0;i<7;i++){
                int icount =0;

                for(int j=0;j<7;j++){
                    if(arr[j] == 1){
                        icount ++;
                    }

                    if(icount == count && j<min){
                        min =j;
                        resultArr= arr.clone();

                        break;
                    }


                }


                for(int j=0;j<6;j++){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
            sb.append(Sol(resultArr,n)+"\n");



        }
        System.out.println(sb);



    }
}


