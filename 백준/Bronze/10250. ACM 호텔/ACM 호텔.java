import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int num = scan.nextInt();

            int dis = (num-1)/H +1;
            int floor = (num-1)%H+1;
            System.out.printf("%d%02d",floor,dis);
            System.out.println();
        }

    }

}