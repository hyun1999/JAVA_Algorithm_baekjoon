import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int[] arr1;
            int[] arr2;
            if(a>b){
                arr1 = new int[b];
                arr2 = new int[a];
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = scan.nextInt();
                }
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = scan.nextInt();
                }
            }else{
                arr1 = new int[a];
                arr2 = new int[b];
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = scan.nextInt();
                }
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = scan.nextInt();
                }
            } // 입력 완료
            int len = arr2.length-arr1.length;
            int max = 0;
            for (int i = 0; i < len+1; i++) {
                int val = 0;
                for (int j = 0; j < arr1.length; j++) {
                    val += arr1[j] * arr2[j+i];
                }
                if(val>max){
                    max = val;
                }
            }
            System.out.print("#"+(tc+1)+" "+max);
            System.out.println();
        }
    }
}
