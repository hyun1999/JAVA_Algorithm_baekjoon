import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = scan.next();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        System.out.println(words[0]);
        for (int i = 1; i < N; i++) {
            if(!words[i].equals(words[i-1])){
                System.out.println(words[i]);
            }
        }

    }
}