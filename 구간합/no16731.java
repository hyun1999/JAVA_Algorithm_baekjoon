package 구간합;

import java.util.Scanner;

public class no16731 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 수의 개수
        int M = scan.nextInt(); // 합을 구해야 하는 개수

        int[] arr = new int[N];
        int[] Sarr = new int[N+1];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Sarr[0] = 0;
        Sarr[1] = arr[0];
        for (int i = 2; i < N+1; i++) {
            Sarr[i] = arr[i - 1] + Sarr[i - 1];
        }

        for (int i = 0; i < M; i++) {
            int first = scan.nextInt();
            int last = scan.nextInt();
            System.out.println(Sarr[last]-Sarr[first-1]);
        }
        
    }
}
