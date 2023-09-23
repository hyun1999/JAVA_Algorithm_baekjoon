package 문자열;

import java.util.Scanner;

public class no1545 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String doc = scan.nextLine();
        String word = scan.nextLine();

        int count = 0;
        int startIndex = 0;

        while(true){
            int findIndex = doc.indexOf(word,startIndex);
            if(findIndex<0)
                break;
            count++;
            startIndex = findIndex+word.length();

        }
        System.out.println(count);
    }
}
