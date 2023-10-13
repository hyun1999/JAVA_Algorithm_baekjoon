import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1]+arr[i];
        }
        int Max = 0;
        for (int i = 1; i < N+1; i++) {
            int j = i+1;
            while(j<=N){
                int localMax = Math.min(sum[j]-sum[i],sum[i]+sum[N]-sum[j]);
                Max = Math.max(Max,localMax);
                if(localMax == Max){
                }
                j++;
            }
        }
        System.out.println(Max);
    }
}
