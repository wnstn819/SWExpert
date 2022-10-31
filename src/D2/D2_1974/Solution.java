package D2.D2_1974;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public static int Sol(int[][] arr){
        int result =1;


        for(int x=0;x<9;x++){
            int[]  row_num = new int[10];
            int[]  col_num = new int[10];
            for(int y=0; y<9;y++){
               int row = arr[x][y];
               int col = arr[y][x];
               if(row_num[row] !=0) return 0;
               if(col_num[col] !=0) return 0;

               row_num[row] +=1;
                col_num[col] +=1;

                if (x % 3 == 0 && y % 3 == 0) {
                    int[] square = new int[10];
                    for(int k=x;k<x+3;k++){
                        for(int w=y;w<y+3;w++){
                            int sq = arr[k][w];
                            if(square[sq]!=0) return 0;
                            square[sq] +=1;
                        }
                    }
                }


            }

        }





        return result;
    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T;i++){

            int[][] arr= new int[9][9];

            for(int j =0;j<9;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<9;k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.println("#"+(i+1) +" "+Sol(arr));

        }


    }
}


