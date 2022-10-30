package D2.D2_1954;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        int T = Integer.parseInt(br.readLine());



        for (int t = 0; t < T; t++) {
            int size = Integer.parseInt(br.readLine());
            int[][] arr = new int[size][size];
            int arrow = 0;
            int placeX = 0;
            int placeY = 0;
            int i=1;
            while (i<=size*size) {
             if(arr[placeY][placeX] == 0 ){
                 arr[placeY][placeX]= i;
                i++;
                 if( placeX+x[arrow] <size && placeX+x[arrow] >=0 && placeY+y[arrow] <size && placeY+y[arrow] >=0 &&arr[placeY+y[arrow]][placeX+x[arrow]] ==0 ){
                     placeX+=x[arrow];
                     placeY+=y[arrow];

                 }else{

                     switch (arrow){
                         case 0:
                             arrow=1;
                             break;
                         case 1:
                             arrow=2;
                             break;
                         case 2:
                             arrow=3;
                             break;
                         case 3:
                             arrow=0;
                             break;
                     }
                     placeX+=x[arrow];
                     placeY+=y[arrow];
                 }

             }else{
                 break;
             }
//
//


            }
            System.out.println("#"+(t+1));

            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}


