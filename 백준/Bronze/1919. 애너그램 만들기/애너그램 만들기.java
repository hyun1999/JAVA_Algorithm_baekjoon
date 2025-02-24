import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char a: str1.toCharArray()){
            count1[a-'a']++;
        }
        for(char a: str2.toCharArray()){
            count2[a-'a']++;
        }
        int result = 0;
        for(int i = 0; i<26;i++){
            result+=Math.abs(count1[i]-count2[i]);
        }
        System.out.println(result);
    }
}
