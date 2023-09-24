package 시간복잡도;

import java.util.Scanner;

public class no10158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();
        int h = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int hour = scan.nextInt();

        int timeX = hour % (2 * w);
        int currentX = x;
        int deltaX = 1;
        while(timeX--> 0){
            if(currentX == w) deltaX = -1;
            else if(currentX == 0) deltaX = 1;
            currentX += deltaX;
        }

        int timeY = hour % (2*h);
        int currentY = y;
        int deltaY = 1;
        while(timeY--> 0){
            if(currentY == h) deltaY = -1;
            else if(currentY == 0) deltaY = 1;
            currentY += deltaY;
        }
        System.out.println(currentX+" "+currentY);
    }
}
