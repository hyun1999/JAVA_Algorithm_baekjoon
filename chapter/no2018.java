package chapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int first,last;
        int count=0;
        int sum;
        for(int i=1;i<=N;i++){
            sum=0;
            for(int j=i;j<=N;j++){
                sum+=j;
                if(sum>N){
                    break;
                }
                else if(sum==N){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
