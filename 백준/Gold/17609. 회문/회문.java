import java.io.IOException;
import java.util.Scanner;

public class Main {
    static boolean isPalindrome(char[] s, int l, int r){
        while (l<=r){
            if(s[l]!=s[r])return false;
            l++;
            r--;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while(T-->0){
            char[] s = scan.next().toCharArray();

            // 1. 그자체로 회문이라면 0
            // 2. 한 글자를 삭제해 회문으로 만들 수 있다면 1
            // 3. 둘 모두 아니면 2
            int l = 0;
            int r = s.length - 1;
            int ans = 0;
            while(l<=r){
                if (s[l]!=s[r]){
                    if(isPalindrome(s,l,r-1)||isPalindrome(s,l+1,r)) ans = 1;
                    else ans = 2;
                    break;
                }
                l++;
                r--;
            }
            System.out.println(ans);
        }




    }
}
