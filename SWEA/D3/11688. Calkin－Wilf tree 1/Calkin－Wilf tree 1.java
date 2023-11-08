import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int a = 1;
            int b = 1;
            String str = scan.next();
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='R'){
                    a = a+b;
                }else if(str.charAt(j)=='L'){
                    b = a+b;
                }
            }
            System.out.print("#"+(i+1)+" "+a+" "+b);
            System.out.println();
        }
    }
}
