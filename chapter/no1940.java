package chapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1940 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        for(int i =0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);

        int sum=0;
        int count=0;
        int first = 0;
        int last = N-1;

        while(first<last){
            if(arr[first]+arr[last]>M){
                last--;
            } else if(arr[first]+arr[last] == M){
                count++;
                first++;
                last--;
            }else{
                first++;
            }
        }

        System.out.println(count);
    }
}
