package D2.D2_1989;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1; testCase<=T;testCase++) {
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] ch = st.nextToken().toCharArray();
            int result =1;
            for(int i=0;i<(ch.length-1)/2;i++){
                if(ch[i] == ch[ch.length-1-i]){
                    result=1;
                }else{
                    result=0;
                    break;
                }
            }
            sb.append(result+"\n");

        }
        System.out.println(sb);



    }
}


