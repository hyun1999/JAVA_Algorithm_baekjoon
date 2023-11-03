import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("#"+(tc+1)+" ");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
