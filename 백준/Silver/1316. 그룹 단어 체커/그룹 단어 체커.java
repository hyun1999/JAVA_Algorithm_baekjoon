import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean bool = true;
            String str = scan.next();
            LinkedList<Character> list = new LinkedList<>();
            boolean[] check = new boolean[26];
            list.add(str.charAt(0));
            check[str.charAt(0)-'a'] = true;
            // 처음 값만 넣어줌
            for (int j = 1; j < str.length(); j++) {
                if(list.peekLast() == str.charAt(j)){
                    list.addLast(str.charAt(j));
                }else{
                    if(check[str.charAt(j)-'a']==false){
                        list.addLast(str.charAt(j));
                        check[str.charAt(j)-'a']=true;
                    }else if(check[str.charAt(j)-'a']==true){
                        bool = false;
                        break;
                    }
                }
            }
            if(bool == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}