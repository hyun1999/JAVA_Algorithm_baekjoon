import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int j = i+1;
            while(j<N){
                int a = arr[j]-arr[i];
                if(a >= M){
                    minVal = Math.min(a,minVal);
                    break;
                }else{
                    j++;
                }
            }
        }
        System.out.println(minVal);
    }
}
