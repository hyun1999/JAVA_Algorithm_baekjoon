package chapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no12891 {
        static int[] myArr = new int[4];
        static int[] checkArr = new int[4];
        static int checkSecret = 0;

        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); //민호가 임의로 만든 DNA문자열의 길이
        int P = Integer.parseInt(st.nextToken()); //비밀번호로 사용할 문자열 길이

        int result=0;
        char[] A= new char[S];



        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<P;i++){
            Add(A[i]);
        }
        if(checkSecret==4){
            result++;
        }
        //슬라이딩 윈도우
        for(int i=P;i<S;i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret==4){
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }

        private static void Add(char c){
            switch(c){
                case 'A':
                    myArr[0]++;
                    if(myArr[0] == checkArr[0])
                        checkSecret++;
                    break;
                case 'C':
                    myArr[1]++;
                    if(myArr[1] == checkArr[1])
                        checkSecret++;
                    break;
                case 'G':
                    myArr[2]++;
                    if(myArr[2] == checkArr[2])
                        checkSecret++;
                    break;
                case 'T':
                    myArr[3]++;
                    if(myArr[3] == checkArr[3])
                        checkSecret++;
                    break;    
            }
        }
        private static void Remove(char c){
            switch(c){
                case 'A':
                    if(myArr[0] == checkArr[0])
                        checkSecret--;
                    myArr[0]--;
                    break;
                case 'C':
                    if(myArr[1] == checkArr[1])
                        checkSecret--;
                    myArr[1]--;
                    break;
                case 'G':
                    if(myArr[2] == checkArr[2])
                        checkSecret--;
                    myArr[2]--;
                    break;
                case 'T':
                    if(myArr[3] == checkArr[3])
                        checkSecret--;
                    myArr[3]--;
                    break;    
            }
        }
}