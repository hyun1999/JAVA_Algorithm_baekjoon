package 이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class no2295 {
    static boolean isExist(int[] arr, int target){
        int l = 0, r = arr.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m] < target) l = m + 1;
            else if(arr[m] > target) r = m - 1;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        // A + B + C = X -> A + B = X - C
        int[] sums = new int[N * (N + 1)/2];
        int sumsIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sums[sumsIndex++] = arr[i] + arr[j];
            }
        }
        Arrays.sort(sums);

        int ans = -1;
        //모든 X - C에 대해 A + B 집합에 존재하는지 확인한다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = arr[i] - arr[j];
                if (isExist(sums, target)){
                    ans = Math.max(ans,arr[i]);
                }
            }
        }
        // A+B = X-C을 만족하는 X중 최대값을 출력한다.
        System.out.println(ans);
    }
}
