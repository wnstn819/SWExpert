package D2.D2_1285;/////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j=0;j<N;j++){
                int A = sc.nextInt();
                if(hm.containsKey(Math.abs(A))){
                    hm.put(Math.abs(A),hm.get(Math.abs(A))+1);
                }else {
                    hm.put(Math.abs(A), 1);
                }

            }
            List<Integer> keySet = new ArrayList<Integer>(hm.keySet());
            Collections.sort(keySet);

            System.out.println("#"+(i+1)+" " +keySet.toArray()[0]+" " + hm.get((Integer) keySet.toArray()[0]));

        }

    }
}