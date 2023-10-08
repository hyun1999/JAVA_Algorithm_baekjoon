package 구간합;

import java.io.IOException;
import java.util.Scanner;

public class no19951 {
    public static void main(String[] args) throws IOException {
        Scanner scan =  new Scanner(System.in);
        int N = scan.nextInt(); // 연병장 크기
        int M = scan.nextInt(); // 조교의 수

        int[] origin = new int[N+1];

        for (int i = 1; i <= N; i++) {
            origin[i] = scan.nextInt();
        }

        int[] delta = new int[N+2];
        while(M-->0){
            int start = scan.nextInt();
            int end = scan.nextInt();
            int k = scan.nextInt();
            // 각 지시에 따른 변화량 delta를 기록한다.
            // delta[i]: [i+N]까지 적용되는 변화량
            delta[start]+=k;
            delta[end+1]-=k;
        }

        // 2.각 칸부터의 변화량을 각 칸에 적용한다.
        int[] accDelta = new int[N+1];
        for (int i = 1; i <= N; i++) {
            accDelta[i] = accDelta[i-1]+delta[i];
        }

        // 3. 변화량이 적용된 각 칸의 높이를 출력한다.
        for (int i = 1; i <= N; i++) {
            System.out.print(origin[i]+accDelta[i]+" ");
        }
        System.out.println();
    }
}
