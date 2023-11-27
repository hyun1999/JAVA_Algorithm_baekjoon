import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int max = 0;
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        indexI++;
        indexJ++;
        System.out.println(max);
        System.out.print(indexI+" "+indexJ);
    }
}