import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(true){
            int N = scan.nextInt();
            if(N==-1){
                break;
            }
            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 1; i <= N-1; i++) {
                if(N%i==0){
                    list.add(i);
                }
            }
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if(sum == N){
                System.out.print(N+" = "+list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    System.out.print(" + "+list.get(i));
                }
                System.out.println();
            }else{
                System.out.println(N+" is NOT perfect.");
            }
        }
    }
}