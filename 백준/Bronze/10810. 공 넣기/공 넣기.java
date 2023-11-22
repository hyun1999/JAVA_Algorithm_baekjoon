import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // N은 바구니 갯수
        int M = scan.nextInt(); // 공 넣는 횟수
        int[] arr = new int[N+1];
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            for (int j = a; j <= b; j++) {
                arr[j] = c;
            }
        }

        for (int i = 1; i <=N; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}