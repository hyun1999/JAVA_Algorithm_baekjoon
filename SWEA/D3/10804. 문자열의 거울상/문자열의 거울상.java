import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            String str = scan.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.add(str.charAt(i));
            }

            System.out.print("#"+tc+" ");
            for (int i = 0; i < str.length(); i++) {
                char value = stack.pop();
                if(value == 'q'){
                    System.out.print('p');
                }else if(value == 'p'){
                    System.out.print('q');
                }else if(value == 'b'){
                    System.out.print('d');
                }else{
                    System.out.print('b');
                }
            }
            System.out.println();
        }
    }
}
