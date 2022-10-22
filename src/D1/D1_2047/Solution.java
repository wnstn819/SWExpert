package D1.D1_2047;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String T;
        T=sc.next();

        char[] arr = T.toCharArray();

        for(int i=0 ; i<T.length();i++){
            if((int)arr[i]>95){
                arr[i] = (char)(arr[i]-32);
            }

        }
        for(char x : arr){
            System.out.print(x);
        }





    }
}