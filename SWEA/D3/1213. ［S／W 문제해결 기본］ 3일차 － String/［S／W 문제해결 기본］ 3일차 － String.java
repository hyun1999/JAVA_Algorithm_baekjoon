import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int T = scan.nextInt();
        for (int tc = 1; tc <= 10; tc++) {
            int num = scan.nextInt();
            String strShort = scan.next();
            char[] arrShort = strShort.toCharArray();
            String strLong = scan.next();
            char[] arrLong = strShort.toCharArray();
            int count = 0;
            for (int i = 0; i < strLong.length()-strShort.length()+1; i++) {
                boolean bool = false;
                for (int j = 0; j < strShort.length(); j++) {
                    if(strShort.charAt(j)==strLong.charAt(i+j)){
                        bool = true;
                    }else if(strShort.charAt(j)!=strLong.charAt(i+j)){
                        bool = false;
                        break;
                    }
                }
                if(bool == true){
                    count++;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
