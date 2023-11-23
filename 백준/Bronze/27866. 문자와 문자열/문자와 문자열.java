import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int index = scan.nextInt();
        System.out.println(str.charAt(index-1));

    }
}