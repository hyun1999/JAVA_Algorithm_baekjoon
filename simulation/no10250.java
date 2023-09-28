package simulation;

import java.util.Scanner;

public class no10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int customerNum = scan.nextInt();
            int frontNumber = 0;
            int backNumber = 0;

            frontNumber = (customerNum-1) % H;
            frontNumber++;
            backNumber = (customerNum-1) / H;
            backNumber++;
            System.out.println(String.format("%d%02d",frontNumber,backNumber));
        }
    }
}
