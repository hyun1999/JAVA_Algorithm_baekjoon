import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        char[] str = scan.nextLine().toUpperCase().toCharArray();
        int[] alpha = new int[26];
        for(int i=0; i<str.length; i++) alpha[str[i] - 'A']++;
        int maxVal = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if(alpha[i] > maxVal) {
                maxVal = alpha[i];
                ch = (char)(i+65);
            }else if(alpha[i] == maxVal){
                ch = '?';
            }
        }
        System.out.println(ch);

    }
}
