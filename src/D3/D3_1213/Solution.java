package D3.D3_1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();


        for(int testcase=1;testcase<=1;testcase++){
            st= new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            String find = st.nextToken();
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int count =0;

            while(str.contains(find)){
                count++;
                int t = str.length();
                str = str.substring(str.indexOf(find)+find.length(),t);
            }

            sb.append("#"+ testcase + " " + (count)+"\n");







        }
        System.out.println(sb);
    }
}