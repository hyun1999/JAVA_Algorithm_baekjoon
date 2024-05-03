import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();

        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < 1100; i++) {
            int count = 0;
            int val = sugar-(i*5);
            int endVal = val % 3;
            count += i;
            count += val/3;
            if(sugar-(i*5)<0) break;

            if(endVal==0 && count>0) {
                minCount = Math.min(minCount,count);
            }

        }
        if(minCount == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(minCount);

    }

}
