import java.util.Scanner;

class Main {
    public static int jagui(int value){
        if(value==1){
            return 1;
        }else{
            return value+jagui(value-1);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        System.out.println(jagui(N));
    }
}