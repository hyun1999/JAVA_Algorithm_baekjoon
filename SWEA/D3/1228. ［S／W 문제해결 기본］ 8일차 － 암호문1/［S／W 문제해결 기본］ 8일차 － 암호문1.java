import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int T = scan.nextInt();
        for (int tc = 1; tc <=10; tc++) {
            int N = scan.nextInt();
            LinkedList list = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                list.add(scan.nextInt());
            }
            int M = scan.nextInt();
            for (int i = 0; i < M; i++) {
                String trash = scan.next();
                int index = scan.nextInt();
                int num = scan.nextInt();
                for (int j = 0; j < num; j++) {
                    list.add(index+j,scan.nextInt());
                }
            }

            System.out.print("#"+tc+" ");
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();

        }
    }
}
