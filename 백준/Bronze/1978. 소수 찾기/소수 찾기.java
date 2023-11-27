import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count=0;
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            boolean bool = false;
            if(value == 2) {
                count++;
            }
            for (int j = 2; j < value; j++) {

                if(value%j==0){
                    bool = false;
                    break;
                }else{
                    bool = true;
                }
            }
            if(bool==true){
                count++;
            }
        }
        System.out.println(count);
    }
}