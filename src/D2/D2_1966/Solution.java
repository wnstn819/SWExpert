package D2.D2_1966;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {


    public static void quickSort(int[] arr, int start, int end){
        int p = partition(arr,start,end);
        if(start<p-1) quickSort(arr,start,p-1);
        if(end>p) quickSort(arr,p,end);

    }
    public static int partition(int[] arr , int start, int end ){

        int pivot = arr[(start+end)/2];

        while(start<=end){

            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end){
                int temp=0;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; end--;
            }



        }
        return start;

    }



    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            sb.append("#"+(i+1)+" ");
            int[] arr = new int[n];
            for(int j=0; j<n;j++){
                arr[j]= Integer.parseInt(st.nextToken());
            }


            quickSort(arr,0,n-1);

            for(int x : arr){
                sb.append(x+" ");

            }
            sb.append("\n");



        }
        System.out.println(sb.toString());

    }
}


