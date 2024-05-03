import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            Stack<String> stack = new Stack<>();
            String[] str = br.readLine().split("");

            // 종료 조건
            if(str.length==1 && str[0].equals(".")){
                break;
            }
            boolean flag = false;
            for (String s:str) {
                if(s.equals("(")||s.equals("[")) stack.push(s);
                else if(s.equals(")")&&!stack.isEmpty()){
                    if(stack.peek().equals("(")){
                        stack.pop();
                    }else{
                        flag = true;
                        break;
                    }
                }
                else if(s.equals("]")&&!stack.isEmpty()){
                    if(stack.peek().equals("[")){
                        stack.pop();
                    }else{
                        flag = true;
                        break;
                    }
                }
                else if(s.equals(")")||s.equals("]") && stack.isEmpty()){
                    flag = true;
                    break;
                }

            }
            if(flag == true || !stack.isEmpty()) System.out.println("no");
            else System.out.println("yes");
        }

    }
}
