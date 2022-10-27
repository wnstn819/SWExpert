package D2.D2_1928;/////////////////////////////////////////////////////////////////////////////////////////////


import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Base64;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
           String str = sc.nextLine();
           byte[] strD = Base64.getDecoder().decode(str);
              System.out.println("#" + (i+1) +" "+ new String(strD, StandardCharsets.UTF_8));
        }

    }
}