import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int len = str.length()-1;
        boolean bool = false;

        for (int i = 0; i < len/2+1; i++) {

            if(str.charAt(i)==str.charAt(len-i)){
                bool = true;
            }else{
                bool = false;
                break;
            }
        }
        if (bool == false&&str.length()!=1){
            System.out.println(0);
        }else{
            System.out.println(1);
        }

    }
}