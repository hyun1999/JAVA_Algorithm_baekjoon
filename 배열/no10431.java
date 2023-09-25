package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class no10431 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[21];
        int[] resultArr = new int[N];

        for (int k = 0; k < N; k++) {
            int result = 0;
            for (int i = 0; i < 21; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 1; i < 21; i++) {
                for (int j = 1; j < i; j++) {
                    if (arr[j] > arr[i]) {
                        result++;
                    }
                }
            }
            resultArr[k] = result;
        }
        for (int i = 1; i < N+1; i++) {
            System.out.println(i+" "+resultArr[i-1]);
        }
    }
}
