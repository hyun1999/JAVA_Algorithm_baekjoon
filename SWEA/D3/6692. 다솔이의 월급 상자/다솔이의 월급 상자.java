import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            float N = scan.nextInt();
            float total = 0;
            for (int i = 0; i < N; i++) {
                float p1 = scan.nextFloat();
                float x1 = scan.nextFloat();
                total+=p1*x1;
            }
            System.out.println("#"+tc+" "+total);
        }
    }
}
