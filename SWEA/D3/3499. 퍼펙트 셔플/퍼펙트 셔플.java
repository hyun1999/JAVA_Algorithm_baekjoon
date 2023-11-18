import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt();
            String[] cards = new String[N];
            for (int i = 0; i < N; i++) {
                cards[i] = scan.next();
            }

            System.out.print("#"+tc+" ");

            if((N%2) == 0){
                for (int i = 0; i < N/2; i++) {
                    System.out.print(cards[i]+" ");
                    System.out.print(cards[i+(N/2)]+" ");
                }
            }else{
                for (int i = 0; i < (N / 2); i++) {
                    System.out.print(cards[i]+" ");
                    System.out.print(cards[i+1+(N/2)]+" ");
                }
                System.out.print(cards[(N/2)]);
            }
            System.out.println();


        }
    }
}