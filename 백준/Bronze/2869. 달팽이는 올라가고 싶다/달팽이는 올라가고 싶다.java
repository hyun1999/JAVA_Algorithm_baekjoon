import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // 올라가는 거리
        int b = scan.nextInt(); // 내려오는 거리
        int v = scan.nextInt(); // 막대기 길이
        int day = (v-b)/(a-b);
        if((v-b)%(a-b)!=0){
            day++;
        }
        System.out.println(day);
    }
}