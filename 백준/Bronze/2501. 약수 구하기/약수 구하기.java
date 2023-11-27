import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //대상 값
        int b = scan.nextInt(); //약수 중 몇번째 수 인지

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= a; i++) {
             if(a%i == 0){
                 list.add(i);
             }
        }

        if(b>list.size()){
            System.out.println(0);
        }else{
            System.out.println(list.get(b-1));
        }
    }
}