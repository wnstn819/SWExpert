package D3.D3_1209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int testcase=1;testcase<=10;testcase++){
           st  = new StringTokenizer(br.readLine());
           int m = Integer.parseInt(st.nextToken());
           int[][] arr = new int[100][100];

           for(int i=0;i<100;i++){
               st = new StringTokenizer(br.readLine());
               for(int j=0;j<100;j++){
                   arr[i][j] = Integer.parseInt(st.nextToken());
               }

           }
           int max = Integer.MIN_VALUE;
           int z=0;
           for(int i=0;i<100;i++){
               int x =0;
               int y =0;
               for(int j=0;j<100;j++){
                   x += arr[i][j];
                   y += arr[j][i];
                   if(i==j){
                       z+=arr[i][j];
                   }

               }
               if(max < x){
                   max = x;
               }
               if(max < y){
                   max = y;
               }
               if(max < z ){
                   max = z;
               }
           }

           sb.append("#"+ m + " "+ max+"\n");








        }
        System.out.println(sb);
    }
}