import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 1; i <= T; i++) {
            String a = scan.next();
            for (int j = 1; j <= a.length(); j++) {
                String b = a.substring(0,j);
                String c = a.substring(j,j+j);
                if(b.equals(c)) {
                    System.out.printf("#%d %d\n",i,b.length());
                    break;
                }
            }
        }
    }
}
