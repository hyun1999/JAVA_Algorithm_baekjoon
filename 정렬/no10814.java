package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class no10814 {
    public static class Member{
        int age;
        String name;
        int index;
        Member(int age, String name, int index){
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            members[i] = new Member(scan.nextInt(), scan.next(), i);
        }

        Arrays.sort(members,((o1, o2) -> {
            if(o1.age != o2.age){
                return o1.age - o2.age;
            }
            return o1.index - o2.index;
        }));

        for (Member member : members) {
            System.out.println(member.age+" "+member.name);
        }
    }
}
