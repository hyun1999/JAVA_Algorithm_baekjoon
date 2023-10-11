import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean isPossible(int[] arr, long mid, int N){
        long sum = 0;
        for(int a : arr){
            sum += a/mid;
        }
        return sum >= N;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long ans = -1;
        long l = 1;
        long r = (1L << 31)-1;

        while(l<=r){
            long mid = (l+r)/2;
            if(isPossible(arr,mid,N)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        System.out.println(ans);
    }
}
