import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[100][100];
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            for (int j = a; j < a+10; j++) {
                for (int k = b; k < b+10; k++) {
                    arr[j][k]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j] !=0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}