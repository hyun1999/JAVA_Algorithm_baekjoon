package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class no7785 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scan.next();
            arr[i][1] = scan.next();
        }

        // 입력 완료

        // 1. 이름 순서에 따라 출입기록을 차례로 정렬한다.
        Arrays.sort(arr,(o1,o2)->{
            return o2[0].compareTo(o1[0]);
        });

        // 2. 각 사원마다 마지막 기록이 enter인지 확인한다.
        for (int i = 1; i < N; i++) {
            if(arr[i-1][0].equals(arr[i][0]) ){
                continue;
            }else{
                if(arr[i-1][1].equals("enter")){
                    System.out.println(arr[i-1][0]);
                }
            }
        }
        if(arr[N-1][1].equals("enter")) {
            System.out.println(arr[N-1][0]);
        }

        // 2-1. 마지막 기록이 enter라면 출력한다.
    }
}
