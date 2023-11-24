import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 1;
        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            count+=2;
            System.out.println();
        }
        count-=4;
        for (int i = N-1; i >=0; i--) {
            for (int j = N-i-1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = count; j > 0; j--) {
                System.out.print("*");
            }
            count-=2;
            System.out.println();
        }
    }
}