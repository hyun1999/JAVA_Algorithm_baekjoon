

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int N = scan.nextInt();

            int speed = 0;
            int distance = 0;
            for (int i = 0; i < N; i++) {
                int add_down = scan.nextInt();
                int value = 0;
                if(add_down == 1){
                    value = scan.nextInt();
                    speed+=value;
                    distance += speed;
                } else if (add_down == 2) {
                    value = scan.nextInt();
                    speed-=value;
                    if(speed<0){
                        speed = 0;
                    }
                    distance += speed;
                } else if(add_down == 0){
                    distance += speed;
                    continue;
                }
            }
            System.out.println("#"+(tc+1)+" "+distance);
        }
    }
}
