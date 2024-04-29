import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            Stack<String> stack = new Stack<>();
            String[] arr = br.readLine().split("");
            for(String j:arr){
                if(j.equals("(")) stack.push("(");
                else if (j.equals(")")) {
                    if(stack.size()==0){
                        flag = true;
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.size()!=0||flag) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}