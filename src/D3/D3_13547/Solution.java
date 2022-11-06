package D3.D3_13547;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static String Sol(char[] arr ) {
        String result = "NO";
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'o'){
                count++;
            }
        }

        if(count+ (15-arr.length) >=8){
            result = "YES";
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
            char[] arr = st.nextToken().toCharArray();


            sb.append(Sol(arr)+"\n");



        }
        System.out.println(sb);



    }
}


