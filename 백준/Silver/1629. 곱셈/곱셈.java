import java.util.Scanner;

public class Main {

    static int a,b,c;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.println(power(a,b));
    }

    static long power(long a,long b){
        if(b == 1){
            return a % c;
        }
        long half = power(a,b/2);
        if(b%2==0){
            return (half*half) % c;
        }else{
            return (((half*half) % c) * a ) % c;
        }
    }

}
