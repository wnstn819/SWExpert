package D1_2071;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[][] arr= new int[T][10];
        for(int i = 0; i<T ;i++){
            for(int j=0;j<10;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        for(int test_case = 1; test_case <= T; test_case++)
        {

            float sum = 0.0f;
            for(int i = 0; i<10; i++){

                    sum += arr[test_case-1][i];

            }

            System.out.println("#" + test_case + " "+ Math.round(sum/10));

        }
    }
}