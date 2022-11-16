package D3.D3_1244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
public class Solution{

    static int max = Integer.MIN_VALUE, n;
    static String maxValue = "";
    static List<String> list = new LinkedList<>();
    static void Sol(char[] arr, int depth){

        String sv = String.valueOf(arr);
        int v = Integer.parseInt(String.valueOf(arr));

        if(depth ==n){
              if(v>max){
                  max = v;
                  maxValue = sv;
              }

        }else{
            if((n-depth)%2==1 && list.contains(sv)){
                return;
            }
            list.add(sv);
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    char[] solArr = arr.clone();
                    char temp;
                    temp = solArr[i];
                    solArr[i] = solArr[j];
                    solArr[j] =temp;
                    Sol(solArr,depth+1);
                }

            }

        }





    }
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        for(int testcase=1;testcase<=m;testcase++){
            st= new StringTokenizer(br.readLine());
            char[] arr = st.nextToken().toCharArray();
            n = Integer.parseInt(st.nextToken());
            Sol(arr,0);
            if(maxValue ==""){
                maxValue=String.valueOf(arr);
            }
            sb.append("#"+testcase+" "+maxValue+"\n");
            max = Integer.MIN_VALUE;

        }
        System.out.println(sb);
    }
}