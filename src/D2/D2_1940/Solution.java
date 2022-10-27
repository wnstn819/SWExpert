package D2.D2_1940;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0;i<T;i++){
         int num = Integer.parseInt(bf.readLine());
         int sum=0;
         int ms = 0;
            for(int j=0; j<num;j++){

           List<Integer> arr = Arrays.stream(bf.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
           if(arr.get(0) ==1){
               ms += arr.get(1);
           }else if(arr.get(0)==2){
               if(arr.get(1) > ms){
                   ms = 0;
               }else{
                   ms -= arr.get(1);
               }

           }


           sum += ms;
       }
             System.out.println("#"+(i+1)+" "+sum);
       }



    }
}