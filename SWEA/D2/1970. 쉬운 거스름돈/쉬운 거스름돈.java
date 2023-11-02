import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int value = scan.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            int g = 0;
            int h = 0;

            for (int i = 0; i < 8; i++) {
                if(value>=50000){
                    a = value/50000;
                    value %= 50000;
                }else if(value>=10000){
                    b = value/10000;
                    value %= 10000;
                }else if(value>=5000){
                    c= value/5000;
                    value %= 5000;
                }else if(value>=1000){
                    d= value/1000;
                    value %= 1000;
                }else if(value>=500){
                    e= value/500;
                    value %= 500;
                }else if(value>=100){
                    f= value/100;
                    value %= 100;
                }else if(value>=50){
                    g= value/50;
                    value %= 50;
                }else{
                    h= value/10;
                }
            }
            System.out.println("#"+(tc+1));
            System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);


        }
    }
}