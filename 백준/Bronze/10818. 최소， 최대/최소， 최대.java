import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            if(value>max){
                max = value;
            }
            if(value<min){
                min = value;
            }

        }
        System.out.println(min+" "+max);

    }
}