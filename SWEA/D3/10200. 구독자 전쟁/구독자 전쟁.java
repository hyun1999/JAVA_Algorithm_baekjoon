import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int total = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int max = Math.min(a,b);
            int min = 0;
            if((a+b)-total>=0){
                min = (a+b)-total;
            }else{
                min = 0;
            }

            System.out.println("#"+tc+" "+max+" "+min);
        }
    }
}
