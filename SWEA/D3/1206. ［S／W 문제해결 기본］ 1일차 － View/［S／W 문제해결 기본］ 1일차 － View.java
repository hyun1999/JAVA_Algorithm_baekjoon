import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int T = scan.nextInt();
            int[] arr = new int[T];
            int count = 0;

            for (int i = 0; i < T; i++) {
                arr[i] = scan.nextInt();
            }

            for (int i = 2; i < T-2; i++) {
                int high = arr[i];
                if(arr[i-1]<=high && arr[i-2]<=high && arr[i+1]<=high && arr[i+2]<=high){
                    int[] arr2 = new int[4];
                    arr2[0] = arr[i-1];
                    arr2[1] = arr[i-2];
                    arr2[2] = arr[i+1];
                    arr2[3] = arr[i+2];
                    Arrays.sort(arr2);
                    int max = arr2[3];
                    count+= arr[i]-max;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
