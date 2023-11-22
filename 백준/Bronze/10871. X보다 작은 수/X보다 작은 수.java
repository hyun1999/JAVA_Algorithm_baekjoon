import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();

            if(value<X){
                System.out.print(value+" ");
            }
        }
    }
}