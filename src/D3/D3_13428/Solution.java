package D3.D3_13428;/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static StringBuilder sb = new StringBuilder();

    static String Sol(String str ) {
        String result;
        int M = Integer.parseInt(str);
        int max =M;
        int min =M;
        if(M == 0){
            return "0 0";

        }

        for(int i=0; i<str.length();i++){
            for(int j=i+1; j<str.length();j++){
                char[] M_arr = str.toCharArray();
                char temp = M_arr[i];
                M_arr[i] = M_arr[j];
                M_arr[j] = temp;
                if(M_arr[0] !='0'){
                    int prev = Integer.parseInt(String.valueOf(M_arr));
                    max = Math.max(max,prev);
                    min = Math.min(min,prev);
                }
            }
        }

        result = min + " " + max;

        return result ;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1;testCase<=T;testCase++){
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String n  = st.nextToken();





            sb.append(Sol(n)+"\n");



        }
        System.out.println(sb);



    }
}