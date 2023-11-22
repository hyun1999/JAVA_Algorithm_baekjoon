import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a==b&&b==c){
            System.out.println(10000+a*1000);
        }else if(a!=b&&b!=c&&a!=c){
            int max = Math.max(a,Math.max(b,c));
            System.out.println(100*max);
        }else{
            if(a==b||a==c){
                System.out.println(1000+a*100);
            }else if(b==c){
                System.out.println(1000+b*100);
            }
        }
    }
}