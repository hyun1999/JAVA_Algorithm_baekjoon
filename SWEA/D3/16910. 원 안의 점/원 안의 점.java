import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int N = scan.nextInt();//반지름
            int count = 0;

            for (int i = -N; i <= N ; i++) {
                for (int j = -N; j <= N ; j++) {
                    if (i*i+j*j<=N*N){
                        count++;
                    }
                }
                
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
