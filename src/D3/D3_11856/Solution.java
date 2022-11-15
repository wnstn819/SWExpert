package D3.D3_11856;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        for (int testcase = 0; testcase < n; testcase++) {
            String result = "No";
           st= new StringTokenizer(br.readLine());
           char[] arr = st.nextToken().toCharArray();
           Arrays.sort(arr);

           if(arr[0] == arr[1] && arr[2] == arr[3] && arr[0] != arr[2]){
               result="Yes";
           }

            sb.append("#" + (testcase + 1) + " " + result+"\n");


        }

        System.out.println(sb);
    }
}