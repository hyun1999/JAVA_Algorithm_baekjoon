
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=50; tc++) {
            int N = scan.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                String str = scan.next();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                }
            }
            // 입력 완료
            int count = 0;
            for (int i = 0; i < N/2; i++) {
                for (int j = 0; j < N; j++) {
                    if(j>=(N/2)-i && j<=N-(N/2)+i-1){
                        count+=arr[i][j];
                    }
                }
            }
            // 중간이전 줄까지 계산 완료
            int a = 0;
            for (int i = N/2; i <= N ; i++) {
                for (int j = 0; j < N; j++) {
                    if(a<=j&&j<=N-1-a){
                        count+=arr[i][j];
                    }
                }
                a++;
            }

            System.out.println("#"+tc+" "+count);
        }
    }
}
