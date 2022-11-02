package D2.D2_1926;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int i=1;i<=T;i++){
            int n=i;
            int count=0;
            while(n>0){
                if(n%10 != 0 &&(n%10)%3==0){
                    count++;
                    n/=10;
                }else{
                    n/=10;
                }
            }
            if(count ==0){
                sb.append(i+" ");
            }else{
                for(int j=0;j<count;j++){
                    sb.append("-");
                }
                sb.append(" ");
            }


        }

        System.out.println(sb);




    }
}


