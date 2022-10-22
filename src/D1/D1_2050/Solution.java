package D1.D1_2050;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String T;
        T=sc.next();

        char[] arr = T.toCharArray();

        for(char x : arr){

            System.out.print((x-64) + " ");
        }





    }
}