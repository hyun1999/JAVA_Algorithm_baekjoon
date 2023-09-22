package 문자열;

import java.util.Scanner;

public class no2744 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        char[] arr = new char[value.length()];

        for(int i = 0; i<value.length();i++){
            arr[i] = value.charAt(i);
            if(arr[i] < 'a'){
                arr[i] = Character.toLowerCase(arr[i]);
            }else{
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
