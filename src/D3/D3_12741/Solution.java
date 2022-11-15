package D3.D3_12741;/////////////////////////////////////////////////////////////////////////////////////////////

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

        for(int testcase = 0 ;testcase<n;testcase++) {
            int[] arr = new int[101];
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for (int i = s; i <= m; i++) {
                arr[i] += 1;
            }

            int v = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = v; i <= y; i++) {

                arr[i] += 2;


            }
            int count = 0;
            for (int i = 0; i <= 100; i++) {
                if (arr[i] > 2) {
                    count++;
                }
            }
            if(count>0){
                count--;
            }
            sb.append("#" + testcase + " " + (count) + "\n");
        }
        System.out.println(sb);

    }

}


