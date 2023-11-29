import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        boolean bool;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            bool = true;
            if(i == 1) bool = false;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool == true){
                sum+=i;
                if(min>i){
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.print(min);
        }
    }
}