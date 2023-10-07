package 정렬;

import java.util.*;

public class no2910 {
    static class Message{
        int num;
        int index;
        Message(int num,int index){
            this.num = num;
            this.index = index;
        }
    }
    static class Frequency{
        Frequency(int num,int count,int firstIndex){
            this.num = num;
            this.count = count;
            this.firstIndex = firstIndex;
        }
        int num;
        int count;
        int firstIndex;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        Message[] messages = new Message[N];
        for (int i = 0; i < N; i++) {
            messages[i] = new Message(scan.nextInt(),i);
        }
        Arrays.sort(messages,(o1,o2)->{
            return o1.num-o2.num;
        });

        Frequency[] frequencies = new Frequency[N];
        int frequencyIndex = 0;
        frequencies[frequencyIndex] = new Frequency(messages[0].num,1,messages[0].index);
        for (int i = 1; i < N; i++) {
            if (messages[i].num!=messages[i-1].num){
                frequencies[++frequencyIndex] = new Frequency(messages[i].num,0,messages[i].index);
            }
            frequencies[frequencyIndex].count++;
        }

        Arrays.sort(frequencies,0,frequencyIndex+1,(o1,o2)->{
            if (o1.count == o2.count){
                return o1.firstIndex - o2.firstIndex;
            }
            return o2.count -o1.count;
        });

        for(int i=0; i<=frequencyIndex;i++){
            while(frequencies[i].count-->0){
                System.out.print(frequencies[i].num + " ");
            }
        }

        // 1. 더 많이 등장한 숫자 먼저
        // 2. 등장 횟수가 같다면 입력으로 먼저 들어온 것이 먼저
    }
}
