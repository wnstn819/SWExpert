package D1.D1_2043;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int a ,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("#" + (i+1)+" " + a/b +" " + a%b);
        }




    }
}