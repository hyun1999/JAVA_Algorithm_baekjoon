package BruteForce;

import java.util.Scanner;

public class no11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();

        String result = "";
        while(N>0){
            int sum = N%B;
            if(sum<10){
                result+=sum;
            }else{
                result+=(char)('A'+sum-10);
            }
            N/=B;
        }

        for (int i = result.length()-1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
        System.out.println();

    }
}
