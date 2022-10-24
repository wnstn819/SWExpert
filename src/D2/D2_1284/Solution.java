package D2.D2_1284;/////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int[] arr = new int[5];
            for(int j=0;j<5;j++){
                arr[j] = sc.nextInt();
            }

             int resultA = arr[0] * arr[4];
           int resultB = 0;
           if(arr[4]>arr[2]){
               resultB= arr[1] + (arr[4]-arr[2]) * arr[3];
           }else{
               resultB= arr[1];

           }

           if(resultA> resultB){
               System.out.println("#" + (i+1) + " " + resultB);
           }else{
               System.out.println("#" + (i+1) + " " + resultA);
           }
        }

    }
}