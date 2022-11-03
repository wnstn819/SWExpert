package D3.D3_15230;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static int Sol(char[] arr){
        int result =97;

        for(int i=0; i<arr.length;i++){
            if(result == (int)arr[i]){
            result++;
            }else {
                break;
            }
        }



        return result-97;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+" ");
               StringTokenizer st = new StringTokenizer(br.readLine());
               char[] arr = st.nextToken().toCharArray();

               sb.append(Sol(arr)+"\n");



        }
        System.out.println(sb);



    }
}


