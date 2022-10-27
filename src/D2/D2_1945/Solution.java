package D2.D2_1945;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String args[]) throws Exception
    {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for(int i=0 ;i<T;i++){
            int[][] arr = {{11,0},{7,0},{5,0},{3,0},{2,0}};

            int num = Integer.parseInt(br.readLine());
            int arrNum =0;

                while(arrNum <5){

                    if(num%arr[arrNum][0] ==0){
                        arr[arrNum][1] +=1;
                        num /= arr[arrNum][0];
                    }else{

                            arrNum++;


                    }
                }



            System.out.println("#" +(i+1) + " "+  arr[4][1] + " "+  arr[3][1]+ " "+  arr[2][1]+ " "+  arr[1][1]+ " "+  arr[0][1]);

        }









    }
}