import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            System.out.println("#"+(tc+1)+" ");
            for (int i = 0; i < N; i++) {
                for (int j = N-1; j >= 0; j--) {
                    System.out.print(arr[j][i]);
                } // 90
                System.out.print(" ");

                for (int j = N-1; j >= 0; j--) {
                    System.out.print(arr[N-i-1][j]);
                } // 180
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(arr[j][N-i-1]);
                } // 270
                System.out.println();
            }
            
        }
    }
}
