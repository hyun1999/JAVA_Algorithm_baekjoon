import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = "-1";
            }
        }

        for (int i = 0; i <5; i++) {
            String str = scan.nextLine();
            for (int j = 0; j <str.length(); j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i].equals("-1")){
                    continue;
                }else{
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}