import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scan.nextInt();
            String str = scan.next();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}