package D3.D3_12004;

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
            int m = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
            String result = "No";
            for (int i = 1; i <= 9; i++) {
                if ((m%i) ==0 && (m%i) < 10 &&(m/i) < 10) {
                    result = "Yes";
                    break;
                }
            }
            sb.append("#" + (testcase + 1) + " " + result+"\n");


        }

        System.out.println(sb);
    }
}