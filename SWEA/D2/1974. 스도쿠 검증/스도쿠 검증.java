import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int[][] arr = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            boolean bool = true;

            for (int i = 0; i < 9; i++) {
                int rsum = 0;
                int csum = 0;
                for (int j = 0; j < 9; j++) {
                    rsum += arr[i][j];
                    csum += arr[j][i];
                }

                if(rsum != 45 ||csum!=45){
                    bool = false;
                }
            }

            if (bool == false) {
                System.out.println("#" + (tc+1) + " 0");
                continue;
            }

            for (int i = 0; i < 9; i+=3) {
                for (int j = 0; j < 9; j+=3) {
                    int sum = 0;
                    for (int x = 0; x < 3; x++)
                        for (int y = 0; y < 3; y++)
                            sum += arr[i+x][j+y];
                    if (sum != 45) {
                        bool = false;
                        break;
                    }
                }
                if (bool == false) break;
            }

            if(bool == false) {
                System.out.println("#" + (tc+1) + " " + 0);
            }else {
                System.out.println("#" + (tc+1) + " " + 1);
            }
        }
    }
}
