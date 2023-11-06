import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int R = scan.nextInt();
            int S = scan.nextInt();
            int W = scan.nextInt();

            int A = P*W;
            int B = 0;
            if(W <= R){
                B = Q;
            }else{
                B = Q+(W-R)*S;
            }
            if(A<B){
                System.out.println("#"+(tc+1)+" "+ A);
            }else{
                System.out.println("#"+(tc+1)+" "+ B);
            }

        }
    }
}
