import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int n = scan.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if(i%2 == 1){
                    sum += i;
                }else{
                    sum -= i;
                }
            }
            System.out.printf("#%d %d",tc+1,sum);
            System.out.println();

        }
    }
}
