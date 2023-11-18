import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt();
            int count = 0;
            for (int i = 1; i <= N; i++) {
                int sum = 0;
                for (int j = i; j <= N; j++) {
                    sum+=j;
                    if(sum==N){
                        count++;
                        break;
                    }else if(sum>N){
                        break;
                    }
                }
            }

            System.out.println("#"+tc+" "+count);
        }
    }
}