import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int[] index = new int[10];

        char[] charIndex = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(charIndex[i] == '9'||charIndex[i] == '6'){
                if(index[6]<index[9]){
                    index[6]++;
                }else if(index[6]>index[9]){
                    index[9]++;
                }else{
                    int a = charIndex[i];
                    index[a-48]++;
                }
            }else{
                index[charIndex[i]-48]++;
            }
        }
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if(index[i]>max){
                max = index[i];
            }
        }
        System.out.println(max);
    }
}
