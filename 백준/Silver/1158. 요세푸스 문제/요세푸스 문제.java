
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 인원 수
        int K = scan.nextInt(); // 제거 번호
        LinkedList list = new LinkedList();
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int current = 0;
        for(int i = 0; i<N;i++) {
            current = (current+K-1) % list.size();
            arr[i] = (int) list.remove(current);
        }
        System.out.print("<");
        for (int i = 0; i < N; i++) {
            if(i==N-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }

        System.out.print(">");
    }
}
