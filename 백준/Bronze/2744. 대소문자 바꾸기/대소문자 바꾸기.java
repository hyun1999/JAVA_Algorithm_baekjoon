import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                String str2 = String.valueOf(str.charAt(i));
                System.out.print(str2.toUpperCase());
            }else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                String str2 = String.valueOf(str.charAt(i));
                System.out.print(str2.toLowerCase());
            }
        }
    }
}