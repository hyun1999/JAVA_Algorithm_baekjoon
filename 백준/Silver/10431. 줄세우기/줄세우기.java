import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int P = scan.nextInt();
        while(P-->0){
            int T = scan.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = scan.nextInt();
            }
            //배열에 입력 완료
            int cnt = 0; // 뒤로 물러서는 횟수
            int[] sorted = new int[20]; //정렬된 배열
            for (int i = 0; i < 20; i++) {
                boolean find = false;
                for (int j = 0; j < i; j++) {
                    if(sorted[j]>h[i]){
                        find = true;
                        for (int k = i-1; k >= j; k--) {
                            sorted[k+1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                }

                if(!find) sorted[i] = h[i];

            }
            System.out.println(T+" "+cnt);
        }
    }
}