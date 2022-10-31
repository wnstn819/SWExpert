package D2.D2_1959;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution1 {

    public static int sol(int a, int b, int[] arr1, int[] arr2){
        int result = Integer.MIN_VALUE;
        int aNum = a > b? a: b;
        int bNum = a>b?b:a;
        int[] arrA = a > b ? arr1 : arr2;
        int[] arrB = a > b ? arr2 : arr1;
        int bCount =0;
        while((bCount+bNum)<=aNum){
            int sum=0;
            for(int i=bCount;i<(bCount+bNum);i++){
                sum += arrA[i]*arrB[i-bCount];
            }
            if(sum >result){
                result= sum;
            }
            bCount++;
        }
        return result;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] aArr = new int[a];
            int[] bArr = new int[b];
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<a;j++){
                aArr[j]= Integer.parseInt(st.nextToken());

            }
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b;j++){
                bArr[j]=Integer.parseInt(st.nextToken());
            }

            sb.append("#").append(i+1).append(" " + sol(a,b,aArr,bArr)).append("\n");
        }
        System.out.println(sb);



    }
}


