import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            Stack<Integer> stack = new Stack();
            int N = scan.nextInt();
            for (int i = 0; i < N; i++) {
                int value = scan.nextInt();
                if(value == 0){
                    stack.pop();
                    continue;
                }
                stack.push(value);
            }
            int sum = 0;
            while(!stack.empty()){
                int value = stack.pop();
                sum += value;
            }
            System.out.println("#"+tc+" "+sum);
        }
    }
}
