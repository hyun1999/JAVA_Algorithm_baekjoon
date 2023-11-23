import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String str = scan.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(count);
    }
}