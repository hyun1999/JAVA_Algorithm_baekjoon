package simulation;

import java.util.Scanner;

public class no2840 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 바퀴의 칸수
        int K = scan.nextInt(); // 바퀴를 돌리는 횟수
        int lastIndex = 0; //마지막 바퀴의 인덱스
        char[] circle = new char[N];
        for (int i = 0; i < N; i++) {
            circle[i] = '?';
        }
        int pointer = 0;
        boolean error = false;
        for (int i = 0; i < K; i++) {
            int inputValue = scan.nextInt();
            String inputStr = scan.next();
            pointer = (inputValue+pointer) % N;
            if(circle[pointer]!='?'){
                if (circle[pointer]!=inputStr.charAt(0)){
                    error = true;
                    break;
                }
                else{
                    circle[pointer] = inputStr.charAt(0);
                    lastIndex = pointer;
                }
            }else{
                for (int j = 0; j < N; j++) {
                    if (circle[j]==inputStr.charAt(0)){
                        error = true;
                    }
                }
                circle[pointer] = inputStr.charAt(0);
                lastIndex = pointer;
            }
        }
        //4 4 1 A 1 A 1 A 1 A일때 !가 나와야함
        if (error == false){
            for (int i = lastIndex; i >= 0 ; i--) {
                System.out.print(circle[i]);
            }
            for (int i = N-1; i > lastIndex; i--) {
                System.out.print(circle[i]);
            }
        }else{
            System.out.println("!");
        }
    }
}
