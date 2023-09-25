package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class no1236 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        char[][] castle = new char[row][col];
        for (int i = 0; i < row; i++) {
            castle[i] = scan.next().toCharArray();
        }
        /**
         * 경비원이 있는지 확인 하는 과정
         */
        boolean[] boolCol = new boolean[col];
        boolean[] boolRow = new boolean[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(castle[i][j] == 'X'){
                    boolRow[i] = true;
                    boolCol[j] = true;

                }
            }
        }

        int countRow = row;
        int countCol = col;

        for (int i = 0; i < row; i++) {
            if(boolRow[i]==true){
                countRow--;
            }
        }
        for (int i = 0; i < col; i++) {
            if(boolCol[i]==true){
                countCol--;
            }
        }
        int result = Math.max(countCol,countRow);
        System.out.println(result);


    }
}
