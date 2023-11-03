import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();
            Queue q = new LinkedList();
            for (int i = 0; i < N; i++) {
                String input = scan.next();
                int count = scan.nextInt();
                for (int j = 0; j < count; j++) {
                    q.add(input);
                }
            }



            System.out.println("#"+(tc+1));
            while(!q.isEmpty()){
                for (int j = 0; j < 10; j++) {
                    if(!q.isEmpty()){
                        System.out.print(q.poll());
                    }else{
                        break;
                    }
                }
                System.out.println();

            }

        }
    }
}
