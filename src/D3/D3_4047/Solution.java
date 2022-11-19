package D3.D3_4047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());


        for(int testcase = 1; testcase<=n;testcase++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String[] arr  = new String[a.length()/3];
            List<String> list = new LinkedList<>();
            boolean check = true;
            for(int i=0;i<a.length()/3;i++) {
                if(list.contains(a.substring(i*3,i*3+3))) {
                    sb.append("#"+testcase + " ERROR\n");
                    check = false;
                    break;
                }else {
                    list.add(a.substring(i*3,i*3+3));
                }

            }
            int s=13,d=13,h=13,c=13;

            if(check) {
                for(String x: list) {
                    switch(x.substring(0,1)) {
                        case "S":
                            s--;
                            break;
                        case "D":
                            d--;
                            break;
                        case "H":
                            h--;
                            break;
                        case "C":
                            c--;
                            break;
                    }
                }

                sb.append("#" + testcase + " " +s + " " + d + " " + h + " "+ c+"\n");
            }


        }
        System.out.println(sb);

    }
}