package D3.D3_1206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int testcase=1;testcase<=10;testcase++){
           st  = new StringTokenizer(br.readLine());
           int m = Integer.parseInt(st.nextToken());
           int[] arr = new int[m];
           st = new StringTokenizer(br.readLine());
           int sum =0;
           for(int i=0;i<m;i++){
               arr[i] = Integer.parseInt(st.nextToken());

               if(i>3){
                   int lmax = Math.max(arr[i-4],arr[i-3]);
                   int rmax = Math.max(arr[i-1],arr[i]);
                   if(lmax<arr[i-2] && rmax<arr[i-2]){

                       sum+= (arr[i-2] - Math.max(lmax,rmax));

                   }

               }
           }
           sb.append("#"+ testcase + " " + sum+"\n");

        }
        System.out.println(sb);
    }
}

