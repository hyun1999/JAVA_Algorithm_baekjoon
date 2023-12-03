import java.io.*;
import java.util.*;

public class Main {
    static class Member implements Comparable<Member>{
        int age;
        String name;
        int idx;
        public Member(int age, String name,int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

        @Override
        public int compareTo(Member o) {
            if(age!=o.age){
                return age-o.age;
            }
            return idx - o.idx;
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            members[i] = new Member(scan.nextInt(),scan.next(),i);

        }
        Arrays.sort(members);

        for (Member member : members) {
            System.out.println(member.age+" "+member.name);
        }
    }
}