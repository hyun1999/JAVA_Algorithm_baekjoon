import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for (int tc = 1; tc <= N; tc++) {
            int max = 0;
            int min = 1000000;

            for (int i = 1; i <= 10; i++) {
                int value = scan.nextInt();
                int sum = 0;
                while (value>0) {
                    sum += value % 10;
                    value = value / 10;
                }
                if (max < sum) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
            }
            System.out.print("#" + tc + " ");
            System.out.println(max + " " + min);
        }
    }
}
