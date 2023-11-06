import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int num = scan.nextInt();
            int[] arr = new int[101];
            for (int i = 0; i < 1000; i++) {
                int value = scan.nextInt();
                arr[value]++;
            }
            int max = 0;
            int index = 0;
            for (int i = 0; i < 100; i++) {
                if(max<=arr[i]){
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println("#"+num+" "+index);

        }
    }
}
