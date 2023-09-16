import java.util.Scanner;

public class no1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double max = 0;
        double[] arr = new double[num];
        for(int i = 0; i<num;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }

        double sum = 0;
        for(int i = 0; i<num;i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
        System.out.println(sum/num);



    }
}
