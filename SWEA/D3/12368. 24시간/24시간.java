import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("#"+tc+" "+((a+b)%24));
        }
    }
}
