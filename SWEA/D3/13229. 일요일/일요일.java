import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = scan.next();
            if(str.equals("MON")){
                System.out.println("#"+tc+" "+6);
            }else if(str.equals("TUE")){
                System.out.println("#"+tc+" "+5);

            }else if(str.equals("WED")){
                System.out.println("#"+tc+" "+4);

            }else if(str.equals("THU")){
                System.out.println("#"+tc+" "+3);

            }else if(str.equals("FRI")){
                System.out.println("#"+tc+" "+2);

            }else if(str.equals("SAT")){
                System.out.println("#"+tc+" "+1);

            }else{
                System.out.println("#"+tc+" "+7);
            }
        }
    }
}
