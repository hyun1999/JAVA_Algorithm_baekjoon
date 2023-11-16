import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int tc = 1; tc <=T; tc++) {
            String str = scan.nextLine();
            String[] strArr = str.split(" ",3);
            char first;


            System.out.print("#"+tc+" ");
            for (int i = 0; i < 3; i++) {
                first = strArr[i].toUpperCase().charAt(0);
                System.out.print(first);
            }
            System.out.println();

        }
    }
}
