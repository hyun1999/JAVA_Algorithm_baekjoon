import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int tc = 0; tc < N; tc++) {
            int T = scan.nextInt();
            boolean bool = false;
            for (int i = 1; i <= T; i++) {
                for (int j = 1; j <= T; j++) {
                    for (int k = 1; k <= T; k++) {
                        int a = (i*(i+1)/2)+(j*(j+1)/2)+(k*(k+1)/2);
                        if(a==T){
                           bool = true;
                           break;
                        }else if(a>=1000){
                            break;
                        }
                    }
                }
            }
            if(bool){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}