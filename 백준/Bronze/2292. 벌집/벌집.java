import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N == 1){
            System.out.println(1);
        }else{
            int count = 1;
            int sum = 1;
            while(true){
                sum+=count*6;
                if(N<=sum){
                    System.out.println(count+1);
                    break;
                }
                count++;
            }
        }
    }
}