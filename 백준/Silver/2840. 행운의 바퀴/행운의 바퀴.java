import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int pointer = 0;
        int N = scan.nextInt();
        int M = scan.nextInt();
        String[] arr =  new String[N];
        boolean[] check = new boolean[N];
        boolean end = false;
        for (int i = 0; i < M; i++) {
            int val = scan.nextInt();
            pointer += val % N;
            pointer %= N;
            String value = scan.next();
            if(!check[pointer]){
                arr[pointer] = value;
                check[pointer] = true;
            }else{
                if(!arr[pointer].equals(value)){
                    end = true;
                    break;
                }
                scan.nextLine();
            }

        }
        
        int[] index = new int[26];
        for (int i = 0; i < N; i++) {
            if(check[i]==true){
                char val = arr[i].charAt(0);
                index[val-'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(index[i]>1){
                end = true;
            }
        }
        
        
        if(end == true){
            System.out.println("!");
        }else{
            for (int i = pointer; i >=0; i--) {
                if(check[i]){
                    System.out.print(arr[i]);
                }else if(!check[i]){
                    System.out.print("?");
                }
            }
            for (int i = N-1; i > pointer; i--) {
                if(check[i]){
                    System.out.print(arr[i]);
                }else if(!check[i]){
                    System.out.print("?");
                }
            }
        }
    }
}