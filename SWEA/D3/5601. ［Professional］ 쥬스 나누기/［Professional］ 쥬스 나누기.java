import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = scan.nextInt();
            System.out.print("#"+tc+" ");
            for (int i = 0; i < n; i++) {
                System.out.print(1+"/"+n+" ");
            }
            System.out.println( );
        }
    }
}
