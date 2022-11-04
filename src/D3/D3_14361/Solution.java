package D3.D3_14361;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    static String Sol(HashMap<Integer,Integer> arr,int n ) {
        String result = "impossible";

        int x = 2;
        while((int)(Math.log10(n*x)+1)== (int)(Math.log10(n)+1)){
            int number = n*x;
            int count =0;
            char[] cal = String.valueOf(number).toCharArray();
            for(char y : cal ){
                if(arr.containsKey(y-'0')){
                    count++;
                }
            }
            if(count == (int)(Math.log10(n)+1)){
                return "possible";
            }
            x++;

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
            String str = st.nextToken();
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(char x: str.toCharArray()){
                hm.put(x-'0',1);
            }

            int num = Integer.parseInt(str);


            sb.append(Sol(hm,num)+"\n");



        }
       System.out.println(sb);



    }
}


