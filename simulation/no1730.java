package simulation;

import java.util.Scanner;

public class no1730 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        char[][] arr = new char[N][N];

        String str = scan.hasNext() ? scan.next():"";
        int x = 0; // 행
        int y = 0; // 열
        boolean[][] passX = new boolean[N][N];
        boolean[][] passY = new boolean[N][N];

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'D'){
                if(x == N-1){
                    continue;
                }
                passX[x][y] = true;
                passX[x+1][y] = true;
                x++;
            }else if(str.charAt(i)=='U'){
                if (x==0) {
                    continue;
                }
                passX[x][y] = true;
                passX[x-1][y] = true;
                x--;
            }else if(str.charAt(i)=='R'){
                if(y==N-1){
                    continue;
                }
                passY[x][y] = true;
                passY[x][y+1] = true;
                y++;
            }else if(str.charAt(i)=='L'){
                if(y==0){
                    continue;
                }
                passY[x][y] = true;
                passY[x][y-1] = true;
                y--;
            }

        }

        for (int i = 0; i < N; i++) {
            String ans ="";
            for (int j = 0; j < N; j++) {
                if(passX[i][j]&&passY[i][j]){
                    ans+="+";
                } else if (passX[i][j]) {
                    ans+="|";
                } else if (passY[i][j]) {
                    ans+="-";
                } else{
                    ans+=".";
                }
            }
            System.out.println(ans);
        }
    }
}
