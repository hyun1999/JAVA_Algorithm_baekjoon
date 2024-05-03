import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String[] arrLocal = br.readLine().split("");
            for (int j = 0; j < arrLocal.length; j++) {
                arr[i][j] = arrLocal[j];
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if(arr[i][j]!=null){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}
