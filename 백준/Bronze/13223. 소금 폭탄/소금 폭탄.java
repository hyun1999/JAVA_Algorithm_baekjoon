import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(":");
        String[] arr2 = scan.nextLine().split(":");
        int sum1 = 0;
        int sum2 = 0;
        sum1 = Integer.parseInt(arr[2])+Integer.parseInt(arr[1])*60+Integer.parseInt(arr[0])*3600;
        sum2 = Integer.parseInt(arr2[2])+Integer.parseInt(arr2[1])*60+Integer.parseInt(arr2[0])*3600;
        if(sum2<sum1){
            sum2+=(60*60*24);
        }

        sum2=sum2-sum1;
        int a = sum2/3600;
        sum2 = sum2%3600;
        int b = sum2/60;
        sum2 = sum2%60;
        int c = sum2;
        if(a==0&&b==0&&c==0){
            System.out.println("24:00:00");
        }else{
            System.out.printf("%02d:%02d:%02d",a,b,c);
        }

    }
}