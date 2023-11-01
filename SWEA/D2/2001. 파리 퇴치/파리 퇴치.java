import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();
            int M = scan.nextInt();

            int[][] arr = new int[N+1][N+1];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            int max = 0;

            for (int i = 0; i < N-M+1; i++) {
                for (int j = 0; j < N-M+1; j++) { //확실
                    int sum = 0;
                    for (int k = i; k < M+i; k++) {
                        for (int l = j; l < M+j; l++) {
                            sum+=arr[k][l];
                        }
                        if(sum>max){
                            max = sum;
                        }
                    }
                }
            }
            System.out.printf("#%d %d",tc+1,max);
            System.out.println();

            
        }
    }
}
