package 정렬;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class no18870 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        // 입력된 좌표를 작은 순으로 정렬한다.
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
            set.add(arr[i]);
        }

        // 정렬된 좌표를 중복을 제거하며 압축된 인덱스를 기록한다.
        Map<Integer,Integer> sortedIndex = new HashMap<>();
        int idx = 0;

        for(int x : set){
            sortedIndex.put(x,idx++);
        }

        // 입력된 좌표에 알맞은 압축 인덱스를 출력한다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(sortedIndex.get(arr[i])+" ");
        }
        bw.flush();
    }
}
