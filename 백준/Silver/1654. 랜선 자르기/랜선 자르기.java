import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(st.nextToken()); // 랜선 갯수
        int N = Integer.parseInt(st.nextToken()); // 만들고싶은 갯수

        int[] arr = new int[K];
        long max = 0;
        long min = 1;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i]){
                max = arr[i];
            }
        }
        long mid = 0;
        while(min<=max){
            mid = (min+max)/2;
            int count = 0;
            for (int i = 0; i < K; i++) {
                count+=arr[i]/mid;
            }
            if(count<N){
                max = mid-1;
            }else{
                min = mid+1;
            }

        }
        System.out.println(min-1);
    }
}