package D3.D3_14555;/////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    static int Sol(Stack<Character> stack){
        int count =0;

        while(!stack.isEmpty()){
            if(stack.peek() == ')' ){
                stack.pop();
                if(!stack.isEmpty() && stack.peek()=='(' || stack.peek() == '|'){
                    stack.pop();
                    count++;
                }
            }else if(stack.peek() == '|'){
                stack.pop();
                if(!stack.isEmpty() && stack.peek() =='('){
                    stack.pop();
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int testCase=1;testCase<=T;testCase++){
            sb.append("#"+testCase+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            Stack<Character> stack = new Stack<>();
            char[] arr = st.nextToken().toCharArray();
            for(char x : arr){
                if(x =='|' || x=='(' || x==')'){
                    stack.push(x);
                }
            }

            sb.append(Sol(stack)+"\n");



        }
       System.out.println(sb);



    }
}


