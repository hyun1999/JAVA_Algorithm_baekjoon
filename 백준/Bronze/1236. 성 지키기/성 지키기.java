import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        String[][] arr = new String[N][M];

        for (int i = 0; i < N; i++) {
            String str = scan.next();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        int row = N;
        int col = M;
        //행 줄 삭제
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j].equals("X")){
                    row--;
                    break;
                }
            }
        }
        //열 줄 삭제
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                if(arr[i][j].equals("X")){
                    col--;
                    break;
                }
            }
        }
        int max = Math.max(row,col);
        System.out.println(max);

        
    }
}