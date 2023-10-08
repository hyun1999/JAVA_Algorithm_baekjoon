package 이분탐색;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class no1920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < N; i++) {
            set.add(scan.nextInt());
        }
        int M = scan.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = scan.nextInt();
        }
        Integer[] set2 = set.toArray(new Integer[0]);
        for (int i = 0; i < M; i++) {
            int l = 0;
            int r = set.size()-1;
            int result = 0;
            while(l<=r){
                int mid = (l+r)/2;
                if(arr[i]>set2[mid]){
                   l = mid+1;
                }else if(arr[i]<set2[mid]){
                    r = mid-1;
                }else{
                    result = 1;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
