package D1.D1_2068;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int i = 0; i<T ;i++){
            int[] arr= new int[10];
            for(int j=0;j<10;j++){
                arr[j]= sc.nextInt();

            }
            Arrays.sort(arr);
            System.out.println("#" + (i+1)+" " +arr[9]);
        }


    }
}