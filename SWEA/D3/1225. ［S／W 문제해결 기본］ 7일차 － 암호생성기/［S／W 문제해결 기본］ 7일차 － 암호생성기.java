import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            Queue q = new LinkedList();
            int num = scan.nextInt();
            for (int index = 0; index < 8; index++) {
                int input = scan.nextInt();
                q.offer(input);
            }
            boolean bool = true;
            while(bool){
                for (int i = 1; i <= 5; i++) {
                    int value = (int) q.poll();
                    if(value-i<=0){
                        q.offer(0);
                        bool = false;
                        break;
                    }else{
                        q.offer(value-i);
                    }
                }
            
            }

            System.out.print("#"+num+" ");
            for (int i = 0; i < 8; i++) {
                System.out.print(q.poll()+" ");
            }
            System.out.println();

        }
    }
}
