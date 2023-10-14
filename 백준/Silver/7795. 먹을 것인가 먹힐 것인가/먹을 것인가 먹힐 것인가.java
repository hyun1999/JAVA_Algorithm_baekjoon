import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int[] resultArr = new int[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int[] arrA = new int[A];
            int[] arrB = new int[B];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < A; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arrA);
            Arrays.sort(arrB);

            int result = 0;
            for (int j = 0; j < arrA.length; j++) {
                for (int k = 0; k < arrB.length; k++) {
                    if(arrA[j]>arrB[k]){
                        result++;
                    }else{
                        break;
                    }
                }
            }
            resultArr[i] = result;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
