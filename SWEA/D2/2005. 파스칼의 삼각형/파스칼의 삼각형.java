import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();
            int[][] arr = new int[N+1][N+1];
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= i; j++) {
                    if(j==0||j==i){
                        arr[i][j]=1;
                    }else{
                        arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                    }
                }
            }
            System.out.println("#"+(tc+1));
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
