import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 1; i <N+1 ; i++) {
            int count = 0;
            if(i<10){
                if(i%3 == 0){
                    System.out.print("-");
                }else{
                    System.out.print(i);
                }
                System.out.print(" ");
            }else if(i<100){
                String a = String.valueOf(i);
                char[] charArr = new char[2];
                for (int j = 0; j < 2; j++) {
                    charArr[j] = a.charAt(j);
                }

                for (int j = 0; j < 2; j++) {
                    if(charArr[j]%3==0&&charArr[j]!='0'){
                        count++;
                    }
                }
                if(count>0){
                    while(count-->0){
                        System.out.print("-");
                    }
                    System.out.print(" ");
                }else{
                    System.out.print(i+" ");
                }
            }else if(i<1000){
                String a = String.valueOf(i);
                char[] charArr = new char[3];
                for (int j = 0; j < 3; j++) {
                    charArr[j] = a.charAt(j);
                }
                for (int j = 0; j < 3; j++) {
                    if(charArr[j]%3==0&&charArr[j]!='0'){
                        count++;
                    }
                }
                if(count>0){
                    while(count-->0){
                        System.out.print("-");
                    }
                    System.out.print(" ");
                }else{
                    System.out.print(i+" ");
                }
            }else{
                System.out.print(1000);
            }
        }

    }
}
