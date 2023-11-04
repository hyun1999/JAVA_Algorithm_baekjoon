import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();
            int[] arr = new int[5];
            while(N!=1){
               if(N%11==0){
                   arr[4]++;
                   N = N/11;
               }else if(N%7==0){
                   arr[3]++;
                   N = N/7;
               }else if(N%5==0){
                   arr[2]++;
                   N = N/5;
               }else if(N%3==0){
                   arr[1]++;
                   N = N/3;
               }else if(N%2==0){
                   arr[0]++;
                   N = N/2;
               }
            }
            System.out.print("#"+(tc+1)+" ");
            for (int i = 0; i < 5; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
