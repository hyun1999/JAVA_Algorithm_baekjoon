import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int total = 0;
            int S = scan.nextInt();
            int E = scan.nextInt();
            int M = scan.nextInt();
            int s = 0;
            int e = 0;
            int m = 0;
            while(true){
                s++;
                e++;
                m++;
                total++;
                if(S==s&&E==e&&M==m){
                    System.out.println("#"+tc+" "+total);
                    break;
                }
                if(s>=365){
                    s = 0;
                }
                if(e>=24){
                    e = 0;
                }
                if(m>=29){
                    m = 0;
                }
            }
        }
    }
}