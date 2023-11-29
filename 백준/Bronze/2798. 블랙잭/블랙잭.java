import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int max = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        for (int i = N-1; i >= 0; i--) {
            for (int j = i-1; j >= 0; j--) {
                for (int k = j-1; k >= 0; k--) {
                    if(arr[i]+arr[j]+arr[k]<=M){
                        if(arr[i]+arr[j]+arr[k]>max){
                            max = arr[i]+arr[j]+arr[k];
                        }
                    }
                }
            }
        }
        System.out.println(max);

    }
}