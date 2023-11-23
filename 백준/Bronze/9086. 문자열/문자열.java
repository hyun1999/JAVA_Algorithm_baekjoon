import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            String str = scan.next();
            System.out.print(str.charAt(0)+""+str.charAt(str.length()-1));
            System.out.println();
        }
    }
}