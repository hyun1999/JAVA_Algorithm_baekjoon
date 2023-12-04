import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] Narr = new String[N];
        String[] Marr = new String[M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Narr[i] = st.nextToken();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            Marr[i] = st.nextToken();
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(Marr[i].equals(Narr[j])){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}