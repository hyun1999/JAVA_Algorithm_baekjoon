import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            Stack<Character> stack = new Stack<>();
            String str = scan.next();
            stack.push(str.charAt(0));
            int count = 0;
            for (int i = 1; i < str.length(); i++) {
                if(stack.peek()=='('&&(str.charAt(i)=='|'||str.charAt(i)==')')){
                    stack.push(str.charAt(i));
                    count++;
                }else if((stack.peek() == '|') && (str.charAt(i)==')')) {
                    stack.push(str.charAt(i));
                    count++;
                }else{
                    stack.push(str.charAt(i));
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
