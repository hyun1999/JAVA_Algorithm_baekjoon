import java.util.Scanner;

public class Main {
    static int N,r,c;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        r = scan.nextInt();
        c = scan.nextInt();
        solve(N,r,c);
        System.out.println(count);
    }
    static void solve(int n,int r,int c){
        int boardSize = 1 << n; //2^n
        int mid = boardSize/2;
        if(n==0) return;

        if(r<mid && c<mid){ // 좌상단
            solve(n-1,r,c);
        }else if(r<mid && c>=mid){ // 우상단
            count+=mid*mid;
            solve(n-1,r,c-mid);
        }else if(r>=mid&& c<mid){
            count+=mid*mid*2;
            solve(n-1,r-mid,c);
        }else if(r>=mid&& c>=mid){
            count+=mid*mid*3;
            solve(n-1,r-mid,c-mid);
        }
    }
}
