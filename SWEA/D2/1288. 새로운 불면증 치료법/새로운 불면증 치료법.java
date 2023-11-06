import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int count = 0;
            boolean[] visited = new boolean[10];
            int n = scan.nextInt();
            int num = 0;

            while(count<10){
                num+=n;
                String string_num = Integer.toString(num);
                for (int i = 0; i < string_num.length(); i++) {
                    int number = Character.getNumericValue(string_num.charAt(i));
                    if(visited[number]== false){
                        visited[number] = true;
                        count++;
                    }
                }
            }
            System.out.println("#"+(tc+1)+ " " +num);
        }
    }
}
