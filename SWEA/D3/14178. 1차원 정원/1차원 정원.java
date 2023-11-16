import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int num = scan.nextInt();
            int bun = scan.nextInt();
            int result = 0;
            int tmp = 1;
            while(tmp<=num){
                tmp += (bun*2)+1;
                result++;
            }
            System.out.println("#"+tc+" "+result);
        }
    }
}
