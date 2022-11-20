package D3.D3_10912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T =Integer.parseInt( st.nextToken());
        for(int testcase = 1; testcase<=T;testcase++) {
            String str = br.readLine();
            List<Character> list = new LinkedList<>();
            for(int i =0;i<str.length();i++) {
                Character ch = str.charAt(i);
                if(list.contains(ch))
                {
                    list.remove(ch);
                }else {
                    list.add(ch);
                }
            }

            Collections.sort(list);
            sb.append("#"+testcase+ " ");
            if(list.size() ==0) {
                sb.append("Good");
            }else {
                for(char x : list) {
                    sb.append(x);
                }
            }

            sb.append("\n");

        }
        System.out.println(sb);

    }

}