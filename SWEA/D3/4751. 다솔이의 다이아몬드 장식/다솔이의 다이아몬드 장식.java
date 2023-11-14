import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            String str = scan.next();
            //첫줄
            for (int i = 0; i < str.length(); i++) {
                System.out.print("..#.");
            }
            System.out.println(".");
            //둘줄
            for (int i = 0; i < str.length()*2; i++) {
                System.out.print(".#");
            }
            System.out.println(".");
            //셋줄
            for (int i = 0; i < str.length(); i++) {
                System.out.print("#."+str.charAt(i)+".");
            }
            System.out.println("#");
            //넷줄
            for (int i = 0; i < str.length()*2; i++) {
                System.out.print(".#");
            }
            System.out.println(".");
            //닷줄
            for (int i = 0; i < str.length(); i++) {
                System.out.print("..#.");
            }
            System.out.println(".");

        }
    }
}
