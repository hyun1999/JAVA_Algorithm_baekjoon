package chapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no11660 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //사각형 크기
        int M = Integer.parseInt(st.nextToken()); //계산 횟수
        int[][] S = new int[N+1][N+1]; //사각형 선언
        
        for(int i = 1; i<=N;i++){ //사각형에 값 저장
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N;j++){
                S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        int x1,x2,y1,y2,sum;
        
        
        for(int i = 0;i<M; i++){
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
 
            sum = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]; 

            System.out.println(sum);
        }
    }
}
