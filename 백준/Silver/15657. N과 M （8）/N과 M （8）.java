import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] numbers;

    static boolean[] check;
    static int[] output;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        numbers = new int[n];
        check = new boolean[n];
        output = new int[m];

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);
        perm(0,0);
        System.out.println(sb);
    }
    static StringBuilder sb = new StringBuilder();

    public static void perm(int depth,int start){
        //base case
        if(depth == m){
            for (int i = 0; i < m; i++) {
                sb.append(output[i] + " ");
            }
            sb.append("\n");

            return;
        }else{
            //recursive case
            for (int i = start; i < n; i++) {
                output[depth] = numbers[i];
                perm(depth+1,i);
            }
        }

    }
}