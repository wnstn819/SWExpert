package D3.D3_14413;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static String Sol(char[][] arr,int n ,int m){
        String result = "possible";
        int x=-1, y=-1;
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++) {
             if(arr[i][j]=='#'){
                 if(x == -1 && y== -1){
                 if((i+j)%2 ==0){
                  x=0;y=1;
                 }else{
                     x=1;y=0;
                 }}

                 if((i+j)%2!=x){
                     return "impossible";
                 }

             }
             if(arr[i][j]=='.'){
                 if(x == -1 && y== -1){
                     if((i+j)%2==0){
                         y=0;x=1;
                     }else{
                         y=1;x=0;
                     }
                 }
                 if((i+j)%2!=y){
                     return "impossible";
                 }
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
            int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
            char[][] arr = new char[n][m];
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                arr[i] = st.nextToken().toCharArray();
            }
            sb.append(Sol(arr,n,m)+"\n");



        }
       System.out.println(sb);



    }
}


