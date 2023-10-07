package 정렬;

import java.util.*;

public class no2910 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();

        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            int message = scan.nextInt();
            map.put(message,map.getOrDefault(message,0)+1);
        }
        Integer[] frequencies = map.keySet().toArray(new Integer[map.size()]);
        Arrays.sort(frequencies,(o1,o2)->{
            return map.get(o2)-map.get(o1);
        });

        for (int frequency : frequencies) {
            int count = map.get(frequency);
            while(count-->0){
                System.out.print(frequency+" ");
            }
        }
    }
}
