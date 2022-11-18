package D3.D3_3499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        for(int testcase = 1; testcase<=m;testcase++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String[] result = new String[n];
            int p1=0;
            int p2=1;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){

                String s = st.nextToken();
                if (n % 2 == 0) {
                    if(i<n/2){
                        result[p1] = s;
                        p1+=2;
                    }else{
                        result[p2] = s;
                        p2+=2;
                    }

                }else{
                    if(i<n/2 + 1){
                        result[p1] =s;
                        p1+=2;
                    }else{
                        result[p2] =s;
                        p2+=2;
                    }
                }
            }
            sb.append("#"+testcase + " ");
           for(String x : result){
               sb.append(x+" ");
           }
            sb.append("\n");





        }
        System.out.println(sb);

    }

}