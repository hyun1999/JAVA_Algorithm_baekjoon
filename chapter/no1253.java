package chapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1253 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            int left = 0;//왼쪽 포인터
            int right = N-1;//오른쪽 포인터
            while(left<right){
                if(arr[left]+arr[right]==arr[i]){
                    if(left!=i && right!=i){
                        count++;
                        break;
                    }else if(left==i){
                        left++;
                    }else if(right==i){
                        right--;
                    }
                } else if(arr[left]+arr[right]<arr[i]){
                    left++;
                } else{
                    right--;
                }
            }
        }
        System.out.println(count);
    }
}
