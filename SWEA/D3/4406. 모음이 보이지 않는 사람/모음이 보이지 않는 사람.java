import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = scan.next();
            String strcpy = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    continue;
                }else{
                    strcpy += str.charAt(i);
                }
            }
            System.out.println("#"+tc+" "+strcpy);
        }
    }
}
