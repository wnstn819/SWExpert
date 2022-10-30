package D2.D2_1948;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int T = Integer.parseInt(br.readLine());
        for(int i = 1;i<T+1;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int[] strArr = new int[4];
            for(int k=0; k<4;k++){
                strArr[k] = Integer.parseInt(st.nextToken());
            }
            StringBuilder sb = new StringBuilder();
            if(strArr[2] - strArr[0] == 0){
                sb.append("#").append(i+" ").append(strArr[1]+strArr[3] -1);
            }
            else{
                int allNum=0;
                for(int j=strArr[0]; j<strArr[2]+1; j++){
                    allNum += arr[j];

                }
                System.out.println(allNum);
                sb.append("#").append(i+" ").append(allNum - (strArr[1] + arr[strArr[2]] - strArr[3])+1);
            }

            System.out.println(sb);








        }



        }

    }
