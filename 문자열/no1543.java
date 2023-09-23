package 문자열;

import java.util.Scanner;

public class no1543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String doc = scan.nextLine();
        String word = scan.nextLine();

        String replaced = doc.replaceAll(word,"");
        int count = (doc.length() - replaced.length())/word.length();
        System.out.println(count);
    }
}
