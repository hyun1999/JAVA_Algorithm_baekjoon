package 정렬;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class no1302 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //key = title, value = 등장 횟수로 저장함
        Map<String,Integer> titles = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            String title = scan.next();
            titles.put(title,titles.getOrDefault(title,0)+1);
        }

        //title을 모두 순회하며 max value를 구하고, max value와 같은 값이 있을 시 max title을 기준으로 사전순으로 빠른걸 max title로 업데이트
        String maxTitle = "";
        int maxCount = 0;
        for (Map.Entry<String,Integer> title: titles.entrySet()) {
            String titleName = title.getKey();
            int count = title.getValue();
            if(count>maxCount || (count == maxCount && titleName.compareTo(maxTitle)<0)){
                maxTitle = titleName;
                maxCount = count;
            }
        }
        //출력
        System.out.println(maxTitle);
    }
}
