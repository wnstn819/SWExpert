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
            int month =(test[4]-48)*10+test[5]-48;
            int day = (test[6]-48)*10+test[7]-48;

            if(days[month] < day || day == 0 || month == 0){
                System.out.println("#" + (i+1) + " -1");
            }else{
                System.out.println("#" + (i+1) + " " +test[0] +test[1] +test[2] +test[3]+"/" +test[4] +test[5] +"/"+test[6] +test[7]);
            }

        }




    }
}