import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push_front")){
                deque.offerFirst(Integer.valueOf(st.nextToken()));
            }else if(str.equals("push_back")){
                deque.offerLast(Integer.valueOf(st.nextToken()));
            }else if(str.equals("pop_front")){
                if(deque.size()==0){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.pollFirst());
                }
            }else if(str.equals("pop_back")){
                if(deque.size()==0){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.pollLast());
                }
            }else if(str.equals("size")){
                System.out.println(deque.size());
            }else if(str.equals("empty")){
                if(deque.size() == 0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                if(deque.size()==0){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.peekFirst());
                }
            }else{
                if(deque.size()==0){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}
