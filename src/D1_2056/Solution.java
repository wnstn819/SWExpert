package D1_2056;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        String[] arr = new String[T];
        for(int i=0; i<T;i++){
            arr[i]= sc.next();

        }
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        for(int i=0;i<T;i++){
            char[] test = arr[i].toCharArray();
            int month =test[4]-48+test[5]-48;
            if(days[test[4]-48+test[5]-48])
            System.out.println(test[1]-48+test[2]-48);
        }




    }
}