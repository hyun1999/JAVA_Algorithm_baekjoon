import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = scan.nextInt();
            }
            // 입력 완료
            if(arr[0] == arr[1] && arr[1] == arr[2]){
                System.out.println("#"+tc+" "+arr[0]);
            }else{
                if(arr[0] == arr[1]){
                    System.out.println("#"+tc+" "+arr[2]);
                }else if(arr[1] == arr[2]){
                    System.out.println("#"+tc+" "+arr[0]);
                }else{
                    System.out.println("#"+tc+" "+arr[1]);
                }
            }

        }
    }
}
