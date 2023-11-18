import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int T = scan.nextInt();
        for (int tc = 1; tc <=10; tc++) {
            int N = scan.nextInt();
            int[] arr = new int[100];

            for (int i = 0; i < 100; i++) {
                arr[i] = scan.nextInt();
            }

            for (int i = 0; i < N; i++) {
                Arrays.sort(arr);
                arr[0]++;
                arr[99]--;
            }

            Arrays.sort(arr);
            System.out.println("#"+tc+" "+(arr[99]-arr[0]));

        }
    }
}
