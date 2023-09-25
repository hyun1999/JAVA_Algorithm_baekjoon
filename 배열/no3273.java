package 배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        int X = Integer.valueOf(br.readLine());

        int count = 0;

        Arrays.sort(arr);
        int first = 0;
        int last = N-1;



        while(first<last){
            int sum = arr[first]+arr[last];
            if(sum<X){
                first++;
            }else if(sum>X){
                last--;
            }else{
                first++;
                last--;
                count++;
            }
        }
        System.out.println(count);
    }
}
