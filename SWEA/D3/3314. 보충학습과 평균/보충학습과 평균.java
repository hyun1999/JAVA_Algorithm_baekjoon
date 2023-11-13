import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            int value = 0;
            for (int i = 0; i < 5; i++) {
                value = scan.nextInt();
                if(value < 40){
                    sum+=40;
                }else{
                    sum+=value;
                }
            }
            System.out.println("#"+tc+" "+(sum/5));


        }
    }
}
