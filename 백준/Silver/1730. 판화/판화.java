import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int currentX = 0;
        int currentY = 0;
        String str = br.readLine();
        boolean[][] arrRow = new boolean[N][N];
        boolean[][] arrCol = new boolean[N][N];

        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if(val == 'D'&&currentX<N-1){
                arrCol[currentX][currentY] = true;
                currentX++;
                arrCol[currentX][currentY] = true;
            }else if(val == 'U'&&currentX>0){
                arrCol[currentX][currentY] = true;
                currentX--;
                arrCol[currentX][currentY] = true;
            } else if (val == 'R'&&currentY<N-1) {
                arrRow[currentX][currentY] = true;
                currentY++;
                arrRow[currentX][currentY] = true;
            } else if(val == 'L'&&currentY>0){
                arrRow[currentX][currentY] = true;
                currentY--;
                arrRow[currentX][currentY] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arrCol[i][j]&&arrRow[i][j]){
                    bw.write("+");
                }else if(arrCol[i][j]==true&&arrRow[i][j]==false){
                    bw.write("|");
                }else if(arrCol[i][j]==false&&arrRow[i][j]==true){
                    bw.write("-");
                }else{
                    bw.write(".");
                }
            }
            bw.write("\n");
        }
        bw.flush();

    }

}