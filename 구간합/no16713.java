package 구간합;

import java.util.Scanner;

public class no16713 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 입력 받는 정수의 길이
        int Q = scan.nextInt(); // 입력 받는 쿼리의 개수

        int[] arr = new int[N+1];
        int[] Sarr = new int[N+1];
        arr[0] = 0;
        for (int i = 1; i < N+1; i++) {
            arr[i] = scan.nextInt();
        }

        Sarr[0] = 0;
        for (int i = 1; i < N+1; i++) {
            Sarr[i] = Sarr[i-1]^arr[i];
        }

        int result = 0;
        for (int i = 0; i < Q; i++) {
            int first = scan.nextInt();
            int last = scan.nextInt();
            result ^=Sarr[last]^Sarr[first-1];
        }
        System.out.println(result);

    }
}
