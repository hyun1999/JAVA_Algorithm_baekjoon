import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int[] arr = new int[26];
            String str = scan.next();
            boolean bool = true;
            for (int i = 0; i < 4; i++) {
                arr[str.charAt(i)-'A']++;
            }
            for (int i = 0; i < 26; i++) {
                if(arr[i] == 1||arr[i] == 3||arr[i]==4){
                    bool = false;
                    break;
                }else{
                    bool = true;
                }
            }
            if(bool == true){
                System.out.println("#"+tc+" Yes");
            }else{
                System.out.println("#"+tc+" No");
            }

        }
    }
}
