import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            int value = scan.nextInt();
            arr[(value%42)]++;
        }
        int count = 0;
        for (int i = 0; i < 42; i++) {
            if(arr[i]>0){
                count++;
            }
        }

        System.out.println(count);
    }
}