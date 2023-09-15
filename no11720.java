import java.util.Scanner;
public class no11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = sc.next();
        char[] charNumber = new char[num];
        charNumber = number.toCharArray();
        
        int sum = 0;
        for (char c : charNumber) {
            sum+=c-'0';
        }
        System.out.println(sum);

    }
}
