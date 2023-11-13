import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int secretMax = Integer.parseInt(st.nextToken());
            LinkedList<Integer> list = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int secretN = 0; secretN < secretMax; secretN++) {
                list.add(Integer.valueOf(st.nextToken()));
            }
            // 입력 완료

            st = new StringTokenizer(br.readLine());
            int commandNum = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < commandNum; i++) {
                String command = st.nextToken();
//                System.out.println("i = "+i+","+"command = "+command);
                if(command.equals("I")){
                    int x = Integer.parseInt(st.nextToken()); //x다음에 y개의 암호문을 삽입
                    int y = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < y; j++){
                        int s = Integer.parseInt(st.nextToken()); // 덧붙일 암호문
                        list.add(x+(j+1),s);
                    }

                }else if(command.equals("D")){
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < y; j++) {
                        list.remove(x+1);
                    }
                }else if(command.equals("A")){
                    int y = Integer.parseInt(st.nextToken());
                    for (int j = 0; j < y; j++) {
                        int s = Integer.parseInt(st.nextToken());
                        list.addLast(s);
                    }
                }
            }


            System.out.print("#"+tc+" ");
            for (int i = 1; i < 11; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
