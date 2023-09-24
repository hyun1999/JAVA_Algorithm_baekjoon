package 문자열;

import java.util.Scanner;

public class no13223 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        String[] currentUnit = time.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmount = currentHour*3600+currentMinute*60+currentSecond;

        String time2 = scan.nextLine();
        String[] dropUnit = time2.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmount = dropHour*3600+dropMinute*60+dropSecond;

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if(needSecondAmount<=0){
            needSecondAmount+=24*3600;
        }

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600)/60;
        int needSecond = needSecondAmount % 60;
        System.out.printf("%02d:%02d:%02d",needHour,needMinute,needSecond);
    }
}
