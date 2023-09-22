package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class no1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = str.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i)-'A']++;
        }

        int maxCount=0;
        int max_index = 0;
        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < 26; i++) {
            if(arr[i]==max){
                maxCount++;
                max_index = i;
            }
        }
        if(maxCount>=2){
            System.out.println("?");
        }else{
            int out = max_index+'A';
            System.out.println((char)out);
        }
    }
}
