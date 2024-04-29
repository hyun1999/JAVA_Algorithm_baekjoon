import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan  = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float total = 0;
        int count = 0;
        for (int i = 0; i <20 ; i++) {
            String arr[] = br.readLine().split(" ");
            float num = 0;
            if(arr[2].equals("P")) continue;
            else if (arr[2].equals("A+")) num = 4.5F;
            else if (arr[2].equals("A0")) num = 4.0F;
            else if (arr[2].equals("B+")) num = 3.5F;
            else if (arr[2].equals("B0")) num = 3.0F;
            else if (arr[2].equals("C+")) num = 2.5F;
            else if (arr[2].equals("C0")) num = 2.0F;
            else if (arr[2].equals("D+")) num = 1.5F;
            else if (arr[2].equals("D0")) num = 1.0F;
            else num = 0F;

            total += num * Float.parseFloat(arr[1]);
            if(!arr[2].equals("P")) count+=Float.parseFloat(arr[1]);

        }
        System.out.println((float)total/(float)count);
    }
}
