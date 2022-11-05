package D3.D3_13732;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static String Sol(char[][] arr, int n ) {
        String result = "yes";
        int x=-1;
        int y=-1;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == '#'){
                    if(x == -1 && y ==-1){
                        x=i;
                        y=j;
                    }
                    count ++;


                }
            }

        }
        double test = Math.sqrt(count);
        if(test != (int)test ){
            return "no";
        }
        double v = Math.log(count) / Math.log(2);
        for(int i = x; i<x+(int) v; i++){
            for(int j = y; j<y+(int) v; j++){
                if(arr[i][j] != '#'){
                    return "no";
                }
            }
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
            int n = Integer.parseInt(st.nextToken());
            char[][] arr = new char[n][n];
            for(int i=0;i<n;i++) {
                st = new StringTokenizer(br.readLine());
                arr[i] = st.nextToken().toCharArray();
            }



            sb.append(Sol(arr,n)+"\n");



        }
        System.out.println(sb);



    }
}


