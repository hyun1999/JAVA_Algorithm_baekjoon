import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println((x[x.length-1]-x[0]) *(y[y.length-1]-y[0]));
    }
}