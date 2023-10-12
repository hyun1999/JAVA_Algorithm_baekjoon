import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+2];
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 입력완료

        for (int i = 1; i <= N+1; i++) {
            int sum = arr[i];

            for (int j = i+1; j <= N+1; j++) {
                if(sum == M){
                    result++;
                    break;
                }
                sum += arr[j];
                if(sum > M){
                    break;
                } else if(sum == M){
                    result++;
                    break;
                } else{
                    continue;
                }
            }
        }
        System.out.println(result);
    }
}

