
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 1=가위 2=바위 3=보
        if(a == 1){
        	if(b == 2){
            	System.out.println("B");
            }else{
                System.out.println("A");
            }
        }else if(a  == 2){
        	if(b == 1){
            	System.out.println("A");
            }else{
                System.out.println("B");
            }
        }else{
        	if(b == 1){
            	System.out.println("B");
            }else{
                System.out.println("A");
            }
        
        }
        
	}
}