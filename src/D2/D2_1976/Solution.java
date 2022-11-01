package D2.D2_1976;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {




    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            for(int j=0;j<4;j++){
                arr[j]= Integer.parseInt(st.nextToken());
            }
            int hour = arr[0]+arr[2];
            int minute = arr[1]+arr[3];
            if(hour>12)  hour -= 12;
            if(minute>60) {minute -= 60; hour +=1;}

            sb.append("#"+(i+1)+" ").append(hour+" "+minute+"\n");



        }
        System.out.println(sb.toString());


    }
}


