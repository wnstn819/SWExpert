package D2.D2_1984;/////////////////////////////////////////////////////////////////////////////////////////////


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

            double max= Double.MIN_VALUE;
            double min= Double.MAX_VALUE;
            double sum =0;
            for(int i=0;i<10;i++){
                int number = Integer.parseInt(st.nextToken());
                if(number>max){
                    max = number;
                }else if(number<min){
                    min = number;
                }
                sum +=number;
            }
            System.out.println((sum-(min+max))/8);
            sb.append(Math.round((sum-(min+max))/8)+"\n");


        }
        System.out.println(sb);



    }
}


