package D3.D3_13229;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    static int Sol(String str ) {
        int result=7;
        String[] day = {"MON", "TUE","WED", "THU", "FRI", "SAT", "SUN"};
        if(str.equals("SUN")){
            return result;
        }
       for(int i=0; i<day.length;i++){
           if(str.equals(day[i])){
              return result-(i+1);
           }



    }

        return result ;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
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


