import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int T = scan.nextInt();
        for (int tc = 1; tc <= 10; tc++) {
            int N = scan.nextInt();
            String str = scan.next();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < N; i++) {
                char value = str.charAt(i);

                if(stack.empty() || value != stack.peek()){
                    stack.push(value);
                }else{
                    stack.pop();
                }

            }
            String result = "";
            while(!stack.empty()){
                result+=stack.pop();
            }

            StringBuffer sb = new StringBuffer(result);
            System.out.println("#"+tc+" "+sb.reverse().toString());

        }
    }
}
