import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int ax = scan.nextInt();
        int ay = scan.nextInt();
        int bx = scan.nextInt();
        int by = scan.nextInt();

        int minX = Math.min(bx-ax,ax);
        int minY = Math.min(by-ay,ay);
        int min = Math.min(minX,minY);

        System.out.println(min);
    }
}