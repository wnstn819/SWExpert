package D2.D2_1940;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Solution1
{
    public static void main(String args[]) throws Exception
    {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0;i<T;i++){
         int num = Integer.parseInt(bf.readLine());
         int sum=0;
         int ms = 0;
         int now=0;
            for(int j=0; j<num;j++){

                StringTokenizer st = new StringTokenizer(bf.readLine());
                int command = Integer.parseInt(st.nextToken());
                if(command !=0){
                   now = Integer.parseInt(st.nextToken());
                   if(command == 1){
                       ms += now;
                   }else{
                       ms -= now;
                       if(ms < 0){
                           ms =0;
                       }
                   }
                }


           sum += ms;
       }
             System.out.println("#"+(i+1)+" "+sum);
       }



    }
}