import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int[] arr = new int[27];
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'A']++ ;
        }
        // str의 값 적절한 index에 입력 완료
        int max = 0;
        int index = 0;
        for (int i = 0; i <= 26; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        // 최댓값 찾기

        int count = 0;
        for (int i = 0; i <= 26; i++) {
            if(max==arr[i]){
                count++;
            }
        }
        // 최댓값이 2개일 경우

        if(count >= 2){
            System.out.println("?");
        }else{
            int index2 = index+'A';
            char index3 = (char) index2;
            System.out.println(index3);
        }
    }
}