import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Long N = scan.nextLong();
        System.out.println(N*(N-1)*(N-2)/6);
        System.out.println('3');
    }
}