package D1.D1_1933;/////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
            if(T%i==0){
                System.out.print(i+" ");
            }
        }




    }
}