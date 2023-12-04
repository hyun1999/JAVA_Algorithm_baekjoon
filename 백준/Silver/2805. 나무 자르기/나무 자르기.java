import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken()); // 나무갯수
        int M = Integer.parseInt(st.nextToken()); // 가져가려고 하는 나무의 길이

        int[] arr = new int[N];
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int mid = 0;
        while(min<max){
            long total = 0;
            mid = (min+max)/2;

            for (int i = 0; i < N; i++) {
                if(arr[i]-mid>0){
                    total+=arr[i]-mid;
                }
            }
            if(total<M){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        System.out.println(min-1);
    }
}