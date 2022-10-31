package D2.D2_1970;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("#"+ (i+1)+"\n");
            int a = Integer.parseInt(st.nextToken());

            int[][] arr = {{50000,0}, {10000,0}, {5000,0}, {1000,0}, {500,0}, {100,0}, {50,0}, {10,0}};


            for(int j=0; j<arr.length;j++){

                if((a/arr[j][0]) > 0){
                    arr[j][1] = a/arr[j][0];
                    a%=arr[j][0];
                }
            }


            for(int k=0;k<arr.length;k++){


                   sb.append(arr[k][1]+" ");
                }

            sb.append("\n");
        }
        System.out.println(sb.toString());


    }
}


