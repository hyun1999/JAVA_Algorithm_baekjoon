import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]+arr[1]>arr[2]){
            System.out.println(arr[0]+arr[1]+arr[2]);
        }else{
            System.out.println((arr[0]+arr[1]-1)+arr[0]+arr[1]);
        }
    }
}