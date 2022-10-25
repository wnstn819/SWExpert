package D2.D2_1288;/////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            boolean x = true;
            HashMap<Integer,Integer> hm = new HashMap<>();

           for(int j=1;;j++){
               int result = N*j;

               while(result>0){
                   int s = result/10;
                   int b = result%10;
                   result /=10;
                   if(!hm.containsKey(b)){
                       hm.put(b,1);
                   }
               }
               if(hm.size() ==10){
                   System.out.println("#" + (i+1) + j*N);
                   break;
               }



           }

        }

    }
}