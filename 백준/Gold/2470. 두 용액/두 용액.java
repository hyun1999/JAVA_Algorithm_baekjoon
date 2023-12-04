import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = N-1;
        int value1 = 0;
        int value2 = 0;
        while(l<r){
            if(Math.abs(arr[l]+arr[r])<min){
                min = Math.abs(arr[l]+arr[r]);
                value1 = arr[l];
                value2 = arr[r];
                if(arr[l]+arr[r]== 0){
                    break;
                }
            }
            if(arr[l]+arr[r]>0){
                r--;
            }else{
                l++;
            }
        }
        System.out.println(value1+" "+value2);


    }
}