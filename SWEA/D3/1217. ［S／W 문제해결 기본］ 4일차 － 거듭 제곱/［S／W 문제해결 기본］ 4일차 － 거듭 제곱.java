import java.util.Scanner;

public class Solution {

    public static int jagui(int a, int b){
        if(b==1){
            return a;
        }
        return a*jagui(a,b-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int tc  = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("#"+tc+" "+jagui(a,b));
        }


    }
}
