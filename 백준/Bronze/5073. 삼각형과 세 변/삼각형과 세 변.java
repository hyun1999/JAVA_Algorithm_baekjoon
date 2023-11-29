import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(true){
            int[] arr = new int[3];
            int count = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = scan.nextInt();
                if(arr[i]==0) count++;
            }

            if(count == 3)break;
            // 입력 완료

            Arrays.sort(arr);
            if(arr[0]+arr[1]<=arr[2]){
                System.out.println("Invalid");
            }else{
                if(arr[0]==arr[1]&&arr[1]==arr[2]){
                    System.out.println("Equilateral");
                }else if(arr[0]==arr[1]||arr[1]==arr[2]||arr[0]==arr[2]){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }
        }
    }
}