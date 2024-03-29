package 구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열의 크기
        int M = Integer.parseInt(st.nextToken()); // 결과 구하는 횟수
        int[][] arr = new int[N+1][N+1];
        int[][] Sarr = new int[N+1][N+1];
        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                Sarr[i][j] = Sarr[i][j-1]+arr[i][j];
                if (j == N&&i<N){
                    Sarr[i+1][0] = Sarr[i][j];
                }
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = 0;
            for (int j = x1; j <= x2; j++) {
                result += Sarr[j][y2] - Sarr[j][y1-1];
            }
            System.out.println(result);
        }
    }
}
