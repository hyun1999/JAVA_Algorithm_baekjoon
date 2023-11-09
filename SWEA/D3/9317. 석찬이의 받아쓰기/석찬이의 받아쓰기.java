import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt();
            String str = scan.next();
            String str2 = scan.next();

            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str2.charAt(i)){
                    result++;
                }
            }
            System.out.println("#"+tc+" "+result);

        }
    }
}
