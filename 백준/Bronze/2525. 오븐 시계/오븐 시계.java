import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt()*60;
        int m = scan.nextInt();
        int input = scan.nextInt();
        int sum = h+m+input;

        h = sum/60;
        m = sum%60;
        if(h>23){
            h-=24;
        }
        System.out.println(h+" "+m);
    }
}