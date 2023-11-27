import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int first = 2; //한 변 점의 개수
        if(N == 0){
            System.out.println(4);
        }else{
            for (int i = 0; i < N; i++) {
                first = first*2-1;
            }
            System.out.println(first*first);
        }

    }
}