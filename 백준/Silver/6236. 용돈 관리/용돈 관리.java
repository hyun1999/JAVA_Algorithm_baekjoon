import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPossible(int[] useAmounts, int drawAmount, int maxDrawCount){
        int drawCount = 1; // 돈꺼낸 횟수 카운트
        int currentAmount = drawAmount; // 현금 상태
        for(int useAmount: useAmounts){
            if (useAmount > drawAmount) return false;
            if(useAmount > currentAmount){
                if(drawCount == maxDrawCount) return false;
                drawCount++;
                currentAmount = drawAmount;
            }
            currentAmount -= useAmount;
        }
        return true;
    }
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

        int r = 10000 * N;
        int l = 1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(isPossible(arr,mid,M)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        System.out.println(ans);
    }
}
