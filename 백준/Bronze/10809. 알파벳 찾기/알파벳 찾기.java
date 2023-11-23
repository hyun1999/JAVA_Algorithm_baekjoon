import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print(str.indexOf(i)+" ");
        }
    }
}