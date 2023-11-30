import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String doc = scan.nextLine();
        String word = scan.nextLine();

        int startIndex = 0;
        int count = 0;
        while(true){
            int findIndex = doc.indexOf(word, startIndex);
            if(findIndex<0){
                break;
            }
            count++;
            startIndex = findIndex+word.length();
        }
        System.out.println(count);
    }
}