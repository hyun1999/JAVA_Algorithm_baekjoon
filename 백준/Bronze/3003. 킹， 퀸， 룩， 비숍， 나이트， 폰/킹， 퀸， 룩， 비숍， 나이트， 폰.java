import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = scan.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i]-input[i]+" ");
        }
    
    }
}