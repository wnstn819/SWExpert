package D3.D3_14692;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine().trim());

        for(int i=1;i<=testCase;i++){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int n = Integer.parseInt(st.nextToken());

            sb.append("#"+i+" "+(n%2==1 ?"Bob":"Alice")+"\n");

        }
        System.out.println(sb);



    }
}


