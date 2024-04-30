import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n){
        int result = 0;
        if(n == 1) result = 1;
        else{
            int beforeVal1 = 0;
            int beforeVal2 = 1;
            for (int i = 0; i < n-1; i++) {
                result =  beforeVal1+beforeVal2;
                beforeVal1 = beforeVal2;
                beforeVal2 = result;
            }
        }
        return result;
    }

//    public static int fibonacci(int n){
//        if(n==0) return 0;
//        else if (n==1) return 1;
//        return fibonacci(n-1)+fibonacci(n-2);
//    }

}
