package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class no1931 {

    static class Meeting{
        int start;
        int end;
        Meeting(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            meetings[i] = new Meeting(scan.nextInt(),scan.nextInt());
        }

        Arrays.sort(meetings,(o1, o2) -> {
            if (o1.end == o2.end){
                return o1.start - o2.start;
            }
            return o1.end-o2.end;
        });

        int count = 0;
        int ended = 0;

        for (Meeting meeting : meetings) {
            if(ended <= meeting.start){
                count++;
                ended = meeting.end;
            }
        }
        System.out.println(count);
    }
}
