import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            String str = scan.next();
            int[] arr = new int[10];
            for (int i = 0; i < str.length(); i++) {
                if(arr[str.charAt(i)-'0']==0){
                    arr[str.charAt(i)-'0']++;
                }else{
                    arr[str.charAt(i)-'0']--;
                }
            }
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if(arr[i]!=0){
                    count++;
                }
            }

            System.out.println("#"+tc+" "+count);

        }
    }
}
