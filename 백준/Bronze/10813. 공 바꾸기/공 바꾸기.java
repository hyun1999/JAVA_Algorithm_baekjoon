import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // N은 바구니 갯수
        int M = scan.nextInt(); // 교환 횟수

        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int tmp;
            tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}