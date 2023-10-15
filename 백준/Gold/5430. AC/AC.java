import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            char[] commands = scan.next().toCharArray();
            int N = scan.nextInt();
            boolean bool = false;
            StringTokenizer st = new StringTokenizer(scan.next(),"[,]");
            Deque<String> deque = new ArrayDeque<>();
            boolean lr = true; // lr이 true이면 왼쪽 false이면 오른쪽
            for (int i = 0; i < N; i++) {
                deque.offer(st.nextToken());
            }
            for (int i = 0; i < commands.length; i++) {
                if (commands[i] == 'R') {
                    lr = !lr;
                } else if (commands[i] == 'D') {
                    if (deque.size() == 0) {
                        System.out.println("error");
                        bool = true;
                        break;
                    } else {
                        if (lr == true) {
                            deque.pollFirst();
                        } else if (lr == false) {
                            deque.pollLast();
                        }
                    }
                }
            }
                // 출력
            if(bool == true){
                continue;
            }else{
                int a = deque.size()-1;
                if(lr == true){
                    if(deque.size()==0){
                        System.out.println("[]");
                    }else{
                        System.out.print("[");
                        for (int i = 0; i < a; i++) {
                            System.out.print(deque.pollFirst()+",");
                        }
                        System.out.print(deque.pollFirst());
                        System.out.print("]");
                        System.out.println();
                    }
                }else{
                    if(deque.size()==0){
                        System.out.println("[]");
                    }else{
                        System.out.print("[");
                        for (int i = 0; i < a; i++) {
                            System.out.print(deque.pollLast()+",");
                        }
                        System.out.print(deque.pollLast());
                        System.out.print("]");
                        System.out.println();
                    }
                }
            }
        }
    }
}
