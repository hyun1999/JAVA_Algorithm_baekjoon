import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a>=1 && a<=9 && b>=1 && b<=9){
                System.out.println("#"+tc+" "+(a*b));
            }else{
                System.out.println("#"+tc+" "+-1);
            }
        }
    }
}
