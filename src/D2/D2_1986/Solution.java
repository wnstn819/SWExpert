package D2.D2_1986;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static int DFS(int n){
        if(n ==0){
            return 0;
        }
        int test=n;
        if(n%2==0) test *=-1;
        return test+DFS(n-1);

    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            sb.append(DFS(n)+"\n");

        }
        System.out.println(sb);



    }
}


