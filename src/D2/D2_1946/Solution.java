package D2.D2_1946;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String args[]) throws Exception
    {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());



        for(int i=0 ;i<T;i++){
            int testCase = Integer.parseInt(br.readLine());

            int lineCount =0;
            System.out.println("#"+ (i+1));
            for(int k=0; k<testCase;k++){
                String[] line = br.readLine().split(" ");



                for(int j=0;j<Integer.parseInt(line[1]);j++){
                    System.out.print(line[0]);
                    lineCount++;
                    if(lineCount%10 == 0){

                        System.out.println();
                    }
                }
            }
            System.out.println();






        }









    }
}