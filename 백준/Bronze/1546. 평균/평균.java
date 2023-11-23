import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        float[] arr = new float[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        float max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        float sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i]/max*100;
        }
        System.out.println(sum/N);

    }
}