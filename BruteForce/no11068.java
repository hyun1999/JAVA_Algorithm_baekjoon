package BruteForce;

import java.util.Scanner;

public class no11068 {

    //진수 변환해서 배열에 담아놓는 함수
    public static int[] convertBase(int x, int B){
        int len = 0, copyX = x;
        while(copyX>0){
            copyX/=B;
            len++;
        }

        int[] digit = new int[len];
        len = 0;
        while(x>0){
            digit[len++] = x%B;
            x = x/B;
        }
        return digit;
    }

    // 좌우 대칭인지 확인하는 함수
    public static boolean isPalindrom(int[] digit){
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] != digit[digit.length -i -1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- > 0){
            int x = scan.nextInt();
            boolean ans = false;
            for (int i = 2; i <= 64; i++) {
                int[] digit = convertBase(x,i);
                if (isPalindrom(digit)){
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? "1":"0");
        }

    }
}
