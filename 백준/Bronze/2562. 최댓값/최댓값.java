import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}