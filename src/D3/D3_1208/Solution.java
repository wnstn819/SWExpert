package D3.D3_1208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int testcase=1;testcase<=10;testcase++){
           st  = new StringTokenizer(br.readLine());
           int m = Integer.parseInt(st.nextToken());
           Integer[] arr = new Integer[100];
            st = new StringTokenizer(br.readLine());
           for(int i=0;i<100;i++){
            arr[i] = Integer.parseInt(st.nextToken());
           }



           for(int i=0;i<m+1;i++){
               Arrays.sort(arr, Collections.reverseOrder());

                   arr[0] -=1;
                   arr[99] +=1;


           }
            System.out.println(arr[0]+ " " + arr[99]);
           sb.append("#"+testcase+" "+ (arr[0]-arr[99]+2) + "\n");



        }
        System.out.println(sb);
    }
}