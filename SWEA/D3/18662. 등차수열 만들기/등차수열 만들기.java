import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int tc = 0; tc < T; tc++) {
            float first = scan.nextInt();
            float middle = scan.nextInt();
            float last = scan.nextInt();
            float newMiddle = 0;
            if(first<last){
                newMiddle = (last+first)/2;
            }else if(first>last){
                newMiddle = (first+last)/2;
            }else{
                newMiddle = first;
            }
            if(middle == newMiddle){
                System.out.println("#"+(tc+1)+" "+0.0);
            }else if(middle>newMiddle){
                float x = middle - newMiddle;
                System.out.println("#"+(tc+1)+" "+String.format("%.1f",x));
            }else{
                float x = newMiddle - middle;
                System.out.println("#"+(tc+1)+" "+String.format("%.1f",x));
            }
        }
    }
}
