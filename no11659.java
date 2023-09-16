import java.util.Scanner;

public class no11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Narr = new int[N];
        int[] Sarr = new int[N];
        for(int i = 0; i<N; i++){
            Narr[i] = sc.nextInt();
            if(i == 0){
                Sarr[i] = Narr[i];
            }
            else{
                Sarr[i] = Narr[i]+Sarr[i-1];
            }
        }
        for(int j = 0; j<M;j++){
            int first = sc.nextInt();
            int last = sc.nextInt();
            if(first <= 1){
                System.out.println(Sarr[last-1]);
            }
            else{
                System.out.println(Sarr[last-1] - Sarr[first-2]);            
            }
        }
    }
}
