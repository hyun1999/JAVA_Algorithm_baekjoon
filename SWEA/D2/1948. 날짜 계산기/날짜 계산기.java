import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        //누적합 문제
        int[] daySum = new int[13];
        daySum[0] = 0;
        daySum[1] = 31;
        daySum[2] = daySum[1]+28;
        daySum[3] = daySum[2]+31;
        daySum[4] = daySum[3]+30;
        daySum[5] = daySum[4]+31;
        daySum[6] = daySum[5]+30;
        daySum[7] = daySum[6]+31;
        daySum[8] = daySum[7]+31;
        daySum[9] = daySum[8]+30;
        daySum[10] = daySum[9]+31;
        daySum[11] = daySum[10]+30;
        daySum[12] = daySum[11]+31;

        for (int tc = 0; tc < T; tc++) {
            int firstM = scan.nextInt();
            int firstD = scan.nextInt();
            int lastM = scan.nextInt();
            int lastD = scan.nextInt();
            int totalDay = 0;
            totalDay += daySum[lastM-1]-daySum[firstM]+1;
            totalDay += daySum[firstM] - daySum[firstM-1]-firstD;
            totalDay += lastD;
            System.out.println("#"+(tc+1)+" "+totalDay);


        }
    }
}
