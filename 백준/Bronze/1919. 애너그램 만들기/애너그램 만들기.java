import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        char[] arr1 = scan.next().toCharArray();
        char[] arr2 = scan.next().toCharArray();
        int[] index1 = new int[26];
        int[] index2 = new int[26];

        for (int i = 0; i < arr1.length; i++) {
            index1[(arr1[i]-'a')]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            index2[(arr2[i]-'a')]++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            if(index1[i]>=index2[i]){
                result += index1[i]-index2[i];
            }else{
                result += index2[i]-index1[i];
            }
        }
        System.out.println(result);


    }
}