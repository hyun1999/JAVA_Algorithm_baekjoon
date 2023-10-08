package 이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class no14425 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //예시 문장 개수
        int M = scan.nextInt(); //테스트 문장 개수

        String[] bogi = new String[N];
        String[] test = new String[M];
        int result = 0;
        for (int i = 0; i < N; i++) {
            bogi[i] = scan.next();
        }
        Arrays.sort(bogi);
        for (int i = 0; i < M; i++) {
            test[i] = scan.next();
        }
        for (int i = 0; i < M; i++) {
            if(Arrays.binarySearch(bogi,test[i]) < 0){
                continue;
            }else{
                result++;
            }
        }
        System.out.println(result);
    }
}
