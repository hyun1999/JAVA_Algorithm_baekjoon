import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C'){
                count+=3;
            }else if(str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F'){
                count+=4;
            }else if(str.charAt(i)=='G'||str.charAt(i)=='H'||str.charAt(i)=='I'){
                count+=5;
            }else if(str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L'){
                count+=6;
            }else if(str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O'){
                count+=7;
            }else if(str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S'){
                count+=8;
            }else if(str.charAt(i)=='T'||str.charAt(i)=='U'||str.charAt(i)=='V'){
                count+=9;
            }else{
                count+=10;
            }
        }
        System.out.println(count);
    }
}