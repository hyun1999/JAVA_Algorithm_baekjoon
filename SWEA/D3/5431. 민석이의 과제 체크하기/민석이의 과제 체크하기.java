import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int total = scan.nextInt(); //총 학생수
            int arr[] = new int[total];
            int good = scan.nextInt(); //제출 한 학생수
            for (int i = 0; i < good; i++) {
                int value = scan.nextInt();
                arr[value-1]++;
            }
            System.out.print("#"+tc+" ");
            for (int i = 0; i < total; i++) {
                if(arr[i] == 0){
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }


    }
}
