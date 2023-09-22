package 문자열;

import java.util.Scanner;

public class no1919 {
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'a']++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int sum = 0;
        int[] arr1 = getAlphabetCount(str1);
        int[] arr2 = getAlphabetCount(str2);
        for (int i = 0; i < 26; i++) {
            if(arr1[i] != arr2[i]){
                sum+=Math.abs(arr1[i]-arr2[i]);
            }
        }
        System.out.println(sum);
    }
}
