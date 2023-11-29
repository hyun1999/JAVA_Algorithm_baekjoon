import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        boolean bool = false;
        int index = 0;
        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j)-'0';
            }
            if(sum+i == N){
                bool = true;
                index = i;
                break;
            }
        }
        if(bool == true){
            System.out.println(index);
        }else{
            System.out.println(0);
        }
    }
}