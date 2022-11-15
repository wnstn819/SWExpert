package D3.D3_11736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        for (int testcase = 0; testcase < n; testcase++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            int[] arr = new int[m];
            for(int i=0;i<m;i++){
                arr[i] = Integer.parseInt(st.nextToken());

            }
            int count =0;
            for(int i=1;i<m-1;i++){
               if(Math.max(arr[i-1],Math.max(arr[i],arr[i+1]) )!= arr[i] && Math.min(arr[i-1],Math.min(arr[i],arr[i+1])) != arr[i]){
                   count++;
               }
            }


            sb.append("#" + (testcase + 1) + " " + count+"\n");


        }

        System.out.println(sb);
    }
}