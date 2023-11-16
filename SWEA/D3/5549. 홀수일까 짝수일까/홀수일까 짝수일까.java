import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            String str = scan.next();
            int lastValue = str.charAt(str.length()-1);
            if(lastValue%2==1){
                System.out.println("#"+tc+" "+"Odd");
            }else{
                System.out.println("#"+tc+" "+"Even");
            }
        }
    }
}
