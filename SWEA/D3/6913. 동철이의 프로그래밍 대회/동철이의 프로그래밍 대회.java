import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
 
        for (int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt(); // N = 사람 수
            int M = scan.nextInt(); // M = 푼 문제 수
            int maxProblem = 0;
            int maxPeople = 0;
            for (int i = 0; i < N; i++) {
                int totalProblem = 0;
                for (int j = 0; j < M; j++) {
                    totalProblem += scan.nextInt();
                }
                if(totalProblem>maxProblem){
                    maxProblem = totalProblem;
                    maxPeople = 0;
                }
                if(totalProblem == maxProblem){
                    maxPeople++;
                }
            }
 
            System.out.println("#"+tc+" "+maxPeople+" "+maxProblem);
 
 
        }
    }
}