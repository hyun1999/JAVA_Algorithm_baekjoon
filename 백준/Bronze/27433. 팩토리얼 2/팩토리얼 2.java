import java.util.Scanner;

public class Main {
    public static long factorial(int value){
        if(value == 1){
            return 1;
        }else{
            return (long)value * factorial(value-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if(N==0){
            System.out.println(1);
        }else if(N==1){
            System.out.println(1);
        }else{
            System.out.println((long)N * factorial(N-1));
        }
    }
}
