import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();



        System.out.println(Integer.parseInt(a)*(Integer.parseInt(String.valueOf(b.charAt(2)))));
        System.out.println(Integer.parseInt(a)*(Integer.parseInt(String.valueOf(b.charAt(1)))));
        System.out.println(Integer.parseInt(a)*(Integer.parseInt(String.valueOf(b.charAt(0)))));

        System.out.println(Integer.parseInt(a)*Integer.parseInt(b));
    }
}