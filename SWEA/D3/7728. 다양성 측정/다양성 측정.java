import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int[] arr = new int[10];
            String str = scan.next();
            int result = 0;

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='0'){
                    arr[0]++;
                }else if(str.charAt(i)=='1'){
                    arr[1]++;
                }else if(str.charAt(i)=='2'){
                    arr[2]++;
                }else if(str.charAt(i)=='3'){
                    arr[3]++;
                }else if(str.charAt(i)=='4'){
                    arr[4]++;
                }else if(str.charAt(i)=='5'){
                    arr[5]++;
                }else if(str.charAt(i)=='6'){
                    arr[6]++;
                }else if(str.charAt(i)=='7'){
                    arr[7]++;
                }else if(str.charAt(i)=='8'){
                    arr[8]++;
                }else{
                    arr[9]++;
                }
            }
            for (int j = 0; j < 10; j++) {
                if(arr[j]!=0){
                    result++;
                }
            }
            System.out.println("#"+tc+" "+result);
        }
    }
}
