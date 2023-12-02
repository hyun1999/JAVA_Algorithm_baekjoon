import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

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
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        //입력 완료

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;
        int count = 0;
        while(i<j){
            if(arr[i]+arr[j]==X){
                count++;
                i++;
                j--;
            }else{
                if(arr[i]+arr[j]>X){
                    j--;
                }else if(arr[i]+arr[j]<X){
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}