import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int num = 1; num <= 10; num++) {
            int findNum = scan.nextInt();

            int count = 0;
            boolean flag = true;

            char[][] arr = new char[8][8];

            for (int i = 0; i < arr.length; i++) {
                String str = scan.next();
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }
            // 입력 완료

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - findNum +1; j++) {
                    flag = true;
                    for (int k = 0; k < findNum/2; k++) {
                        if(arr[i][j+k]!=arr[i][j-k+findNum-1]){
                            flag = false;
                        }
                    }
                    if(flag){
                        count++;
                    }
                }
            }

            for (int i = 0; i < arr.length - findNum +1; i++) {
                for (int j = 0; j < arr.length; j++) {
                    flag = true;
                    for (int k = 0; k < findNum/2; k++) {
                        if(arr[i+k][j]!=arr[i-k+findNum-1][j]){
                            flag = false;
                        }
                    }
                    if(flag){
                        count++;
                    }
                }
            }


            System.out.println("#"+num+" "+count);

        }
    }
}
