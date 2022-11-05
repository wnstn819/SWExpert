package D3.D3_14178;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static int Sol(int n, int d ) {
        int result = 1;
        for(int i = d*2 +1 ; i<n;i+=d*2+1){
            result ++;
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
            int n = Integer.parseInt(st.nextToken()), d=Integer.parseInt(st.nextToken());


            sb.append(Sol(n,d)+"\n");



        }
       System.out.println(sb);



    }
}


