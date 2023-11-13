import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] arr = new int[N+M+1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    arr[i+j]++;
                }
            }
            int max = 0;
            for (int i = 1; i <= N+M; i++) {
                if(arr[i]>max){
                    max = arr[i];
                }
            }

            System.out.print("#"+tc+" ");
            for (int i = 1; i <= N+M; i++) {
                if(arr[i] == max){
                    System.out.print(i+" ");
                }
            }
            System.out.println();


        }
    }
}
