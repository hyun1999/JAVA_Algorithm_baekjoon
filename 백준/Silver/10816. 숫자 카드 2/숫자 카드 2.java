import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        Map<Integer,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x,map.getOrDefault(x,0)+1);
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while(M-->0){
            int x = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(x,0)+" ");
        }
        bw.flush();
    }
}