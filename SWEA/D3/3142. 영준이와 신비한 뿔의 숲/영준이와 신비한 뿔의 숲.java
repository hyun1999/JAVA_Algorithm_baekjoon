import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int N = scan.nextInt();
            int M = scan.nextInt();

            for (int i = 0; i <= M; i++) {
                if(N-(i*2)-(M-i) == 0){
                    System.out.println("#"+tc+" "+(M-i)+" "+i);
                    break;
                }
            }
        }
    }
}
