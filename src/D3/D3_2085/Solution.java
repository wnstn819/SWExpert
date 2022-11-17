package D3.D3_2085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        for(int testcase=1;testcase<=T;testcase++){
            st= new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[m][m];
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                arr[i] = Stream.of(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray();
            }
            int start = m/2;
            int end =m/2;
            int sum =0;
            for(int i=0;i<m;i++){
                for(int j=start;j<=end;j++){

                        sum +=arr[i][j];


                }
                if(i>=(m/2)){
                    start++;
                    end--;
                }else{
                    start--;
                    end++;
                }

            }
            sb.append("#"+ testcase + " " + sum+"\n");







        }
        System.out.println(sb);
    }
}