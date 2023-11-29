import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        boolean bool = false;
        int indexI = 0;
        int indexJ = 0;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if(a*i+b*j == c){
                    if(d*i+e*j == f){
                        bool = true;
                        indexJ = j;
                        indexI = i;
                        break;
                    }
                }
            }
            if(bool == true){
                System.out.println(indexI+" "+indexJ);
                break;
            }
        }
    }
}