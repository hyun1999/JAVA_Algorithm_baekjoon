package BruteForce;

import java.util.Scanner;

public class no11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();
        int mixNum = 1;
        int K = 0;

        //최대 지수 구하기
        while(mixNum * B <=N){
            mixNum *=B;
            K++;
        }

        //
        String result = "";
        while(N>0){
            int D = N/mixNum;
            N%=mixNum;
            mixNum/=B;

            if(D<10)result+=D;
            else result+=((char)('A'+D-10));
        }
        System.out.println(result);

    }
}
