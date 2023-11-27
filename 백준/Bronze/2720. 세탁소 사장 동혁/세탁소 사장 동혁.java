import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int QUARTER = 25;
        int DIME = 10;
        int NICKEL = 5;
        int PENNY = 1;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int input = scan.nextInt();

            System.out.print(input/QUARTER+" ");
            input %= QUARTER;
            System.out.print(input/DIME+" ");
            input %= DIME;
            System.out.print(input/NICKEL+" ");
            input %= NICKEL;
            System.out.print(input/PENNY+" ");
            input %= PENNY;
            System.out.println();
        }
    }
}