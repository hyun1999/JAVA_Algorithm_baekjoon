import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt();
            int[] arr = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
                sum += arr[i];
            }
            int avg =  sum/N;

            int count = 0;
            for (int i = 0; i < N; i++) {
                if(arr[i]<=avg){
                    count++;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}