import java.util.Scanner;
/**
 * 2750 수 정렬하기
 */
public class no2750 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        int tmp;
        
        for(int i=0; i<num; i++){
            arr[i] = scan.nextInt();
        }
		for(int i = 0; i < num - 1; i++) {
			for(int j = i + 1; j < num; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
