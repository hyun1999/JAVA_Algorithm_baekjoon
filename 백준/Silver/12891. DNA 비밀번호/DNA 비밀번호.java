import java.util.Scanner;

public class Main {
    static int baseToIndex(char alp){
        if(alp == 'A') return 0;
        else if(alp == 'C') return 1;
        else if(alp == 'G') return 2;
        else if(alp == 'T') return 3;
        return -1;
    }

    static boolean isValid(int[] count,int[] minimunCount){
        for(int i = 0;i<count.length;i++){
            if(count[i]<minimunCount[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int S = scan.nextInt();
        int P = scan.nextInt();
        char[] sequence = scan.next().toCharArray();
        int[] minimumCount = new int[4];
        for (int i = 0; i < 4; i++) {
            minimumCount[i] = scan.nextInt();
        }
        int[] count = new int[4];
        for (int i = 0; i < P-1; i++) {
            count[baseToIndex(sequence[i])]++;
        }
        int ans = 0;
        //모든 경우의 수 탐색
        for (int i = P-1; i < S; i++) {
            // 이번 윈도우의 끝값을 추가
            count[baseToIndex(sequence[i])]++;
            if(isValid(count,minimumCount)){
                ans++;
            }
            // 이번 윈도우의 첫값을 제거
            count[baseToIndex(sequence[i-P+1])]--;
        }

        System.out.println(ans);

    }
}
