import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String origin = scan.next();
        List<Character> list = new LinkedList<>();

        for (Character alp : origin.toCharArray()) {
            list.add(alp);
        }

        int M = scan.nextInt();
        ListIterator<Character> it = list.listIterator(list.size());
        while(M-->0){
            char cmd = scan.next().charAt(0);
            if(cmd == 'L'){
                if(it.hasPrevious())
                    it.previous();
            }else if(cmd == 'D'){
                if(it.hasNext())
                    it.next();
            }else if(cmd == 'B'){
                if(it.hasPrevious()){
                    it.previous();
                    it.remove();
                }
            }else if(cmd == 'P'){
                it.add(scan.next().charAt(0));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char alp:list){
            sb.append(alp);
        }
        System.out.println(sb);
    }
}
