package D2.D2_1961;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static StringBuilder sb = new StringBuilder();
    public static void rotate(int[][] nArr,int n,int v){


        for(int w = n-1; w>=0; w--){

            sb.append(nArr[w][v]);
        }
        sb.append(" ");
        for(int w = n-1; w>=0; w--){

            sb.append(nArr[n-(v+1)][w]);
        }
        sb.append(" ");
        for(int w=0; w<n;w++){

            sb.append(nArr[w][n-(v+1)]);
        }
        sb.append("\n");




    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] nArr = new int[n][n];
            sb.append("#" + (i + 1) + "\n");
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int k = 0; k < n; k++) {
                    nArr[j][k] = Integer.parseInt(st.nextToken());
                }

            }
            for(int v=0;v<n;v++){

                rotate(nArr,n,v);
            }




        }
        System.out.println(sb.toString());
    }
}


