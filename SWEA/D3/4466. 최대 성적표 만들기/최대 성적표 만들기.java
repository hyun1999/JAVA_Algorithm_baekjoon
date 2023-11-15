import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);

            int count = 0;
            for (int i = 0; i < M; i++) {
                count+=arr[N-i-1];
            }

            System.out.println("#"+tc+" "+count);
        }
    }
}
