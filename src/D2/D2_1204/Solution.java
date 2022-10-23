package D2.D2_1204;/////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String A = sc.nextLine();
            String B = sc.nextLine();
            HashMap<String,Integer> hm = new HashMap<String,Integer>();
            for(String x : B.split(" ")){
                if(hm.containsKey(x)){
                    hm.put(x,hm.get(x)+1);

                }else{
                    hm.put(x,1);
                }
            }
            List<String> lt = new ArrayList<>(hm.keySet());
//           lt.sort(new Comparator<String>() {
//               @Override
//               public int compare(String o1, String o2) {
//                   return hm.get(o1) - hm.get(o2);
//               }
//           });
            lt.sort((o1,o2)-> hm.get(o1) - hm.get(o2));
            System.out.println("#" +A+" "+lt.get(lt.size()-1));
        }




    }
}