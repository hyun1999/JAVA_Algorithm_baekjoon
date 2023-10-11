import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean isPossible(int[] height, int cutH, int M){
        long sum = 0;
        for(int h: height){
            if(h>cutH) {
                sum += h-cutH;
            }
        }
        return sum >= M;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 절단기 높이의 탐색 범위를 정한다.
        int l = 0, r = 1000000000, ans = -1;

        // 2. 임의의 절단기 높이에 대해
        // 2-1. 원하는 만큼 나무를 가져갈 수 있다면 높이를 높여본다.
        // 2-2. 원하는 나무만큼 가져갈 수 없다면 높이를 낮춰본다.
        while(l<=r){
            int mid = (l+r)/2;
            if(isPossible(arr,mid,M)){
                ans = mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        // 3. 원하는 만큼 가져갈 수 있었던 높이 중 최댓값을 출력한다.
        System.out.println(ans);
    }
}
