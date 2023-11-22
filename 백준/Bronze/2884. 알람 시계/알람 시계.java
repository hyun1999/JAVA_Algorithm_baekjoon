import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt()*60;
        int m = scan.nextInt();

        int sum = h+m-45;
        if(sum<0){
            sum+=60*24;
        }
        h = sum / 60;
        m = sum%60;
        System.out.println(h+" "+m);
    }
}