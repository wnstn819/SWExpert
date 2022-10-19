package D1_2070;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[][] arr= new int[T][2];
        for(int i = 0; i<T ;i++){
            for(int j=0;j<2;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        for(int test_case = 1; test_case <= T; test_case++){
            if(arr[test_case-1][0] > arr[test_case-1][1]){
                System.out.println("#" + (test_case) + " >");
            }else if(arr[test_case-1][0] == arr[test_case-1][1]){
                System.out.println("#" + (test_case) + " =");
            }else{
                System.out.println("#" + (test_case) + " <");
            }
        }
    }
}