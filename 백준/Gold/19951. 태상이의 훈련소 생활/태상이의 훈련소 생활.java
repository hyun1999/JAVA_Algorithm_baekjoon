import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //연병장 상태 입력
        int[] check = new int[N+2];
        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            check[start] += count;
            check[end+1] -= count;
        }
        int[] comp = new int[N+1];
        for (int i = 1; i <= N; i++) {
            check[i] = check[i]+check[i-1];
        }
        for (int i = 1; i <=N; i++) {
            System.out.print(check[i]+arr[i]+" ");
        }

    }
}