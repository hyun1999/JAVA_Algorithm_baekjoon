import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int angle = scan.nextInt();
            int hour = angle/30;
            angle = angle%30;
            int minuite = angle*2;

            System.out.println("#"+tc+" "+hour+" "+minuite);

        }
    }
}
