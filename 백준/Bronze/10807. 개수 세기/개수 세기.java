import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int val = Integer.parseInt(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken()) == val){
                count++;
            }
        }
        System.out.println(count);

    }
}