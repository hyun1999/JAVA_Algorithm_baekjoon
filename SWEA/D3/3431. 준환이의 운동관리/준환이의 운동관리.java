import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int L = scan.nextInt();
            int U = scan.nextInt();
            int X = scan.nextInt();

            if(X<L){
                System.out.println("#"+tc+" "+(L-X));
            }else if(X>U){
                System.out.println("#"+tc+" "+-1);
            } else{
                System.out.println("#"+tc+" "+0);
            }

        }
    }
}