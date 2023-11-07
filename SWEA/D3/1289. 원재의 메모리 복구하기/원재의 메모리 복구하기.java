import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = scan.next();
            int[] origin = new int[str.length()];
            int[] arr = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            // 입력 완료

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(origin[i] != arr[i]){
                    if(arr[i] == 1){
                        for (int j = i; j < str.length(); j++) {
                            origin[j] = 1;
                        }
                        count++;
                    }else{
                        for (int j = i; j < str.length(); j++) {
                            origin[j] = 0;
                        }
                        count++;
                    }
                }else{
                    continue;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
