package D3.D3_15612;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {

    public static String Sol(char[][] arr){
        String result = "yes";

        HashMap<String,Integer> hm = new HashMap<>();
        int count =0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(arr[i][j] == 'O' ){
                    count++;
                    if( hm.containsKey("X"+i) || hm.containsKey("Y"+j)){
                       return "no";
                    }else{
                        hm.put("X"+i,1);
                        hm.put("Y"+j,1);
                    }
                }
            }
        }

        if(count != 8){
            result = "no";
        }
        return result;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+" ");

            char[][] arr = new char[8][8];

           for(int i=0;i<8;i++){
               StringTokenizer st = new StringTokenizer(br.readLine());
                  arr[i]= st.nextToken().toCharArray();
           }

           sb.append(Sol(arr)+"\n");
        }
        System.out.println(sb);



    }
}


