import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] str = new int[N];
        for (int i = 0; i < N; i++) {
            str[i] = scan.nextInt();
        }
        int count = 0;
        int find = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if(str[i] == find){
                count++;
            }
        }
        System.out.println(count);
    }
}