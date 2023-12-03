import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        // XOR = 하나만 1일때 1반환
        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = scan.nextInt();
        }
        //Q 입력 완료
        int[] sum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1]^arr[i];
        }
        //누적합

        int ans = 0;

        while(Q-->0){
            int i = scan.nextInt();
            int j = scan.nextInt();
            ans ^= sum[j]^sum[i-1];
        }
        System.out.println(ans);

    }
}