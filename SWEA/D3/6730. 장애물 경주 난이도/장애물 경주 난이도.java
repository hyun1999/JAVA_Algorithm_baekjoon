import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = scan.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }
            int downToUp = 0;
            int upToDown = 0;
            for (int i = 0; i < N-1; i++) {
                if(arr[i]<=arr[i+1]){
                    int gap = arr[i+1] - arr[i];
                    if(gap>downToUp){
                        downToUp = gap;
                    }
                }else{
                    int gap = arr[i]-arr[i+1];
                    if(gap>upToDown){
                        upToDown = gap;
                    }
                }
            }
            System.out.println("#"+tc+" "+downToUp+" "+upToDown);

        }
    }
}
