package 정렬;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class no1181 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.next();
        }
        // 길이가 짧은것 부터
        // 길이가 같으면 사전 순으로
        Arrays.sort(arr, (o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        // 중복된 단어는 하나만 남기고 제거해야 한다.
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if(!arr[i].equals(arr[i-1]))
                System.out.println(arr[i]);
        }
    }
}
