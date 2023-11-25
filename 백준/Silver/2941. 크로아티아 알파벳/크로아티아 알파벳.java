import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int[] arr = new int[8];
        for (int i = 0; i < str.length(); i++) {
            if(str.contains("c=")){
                str = str.replaceAll("c=","0");
            }else if(str.contains("c-")){
                str = str.replaceAll("c-","1");
            }else if(str.contains("dz=")){
                str = str.replaceAll("dz=","7");
            }else if(str.contains("d-")){
                str = str.replaceAll("d-","3");
            }else if(str.contains("lj")){
                str = str.replaceAll("lj","4");
            }else if(str.contains("nj")){
                str = str.replaceAll("nj","5");
            }else if(str.contains("s=")){
                str = str.replaceAll("s=","6");
            }else if(str.contains("z=")){
                str = str.replaceAll("z=","2");
            }
        }
        int len = str.length();
        for (int i = 0; i < 7; i++) {
            if(arr[i]>=0){
                len = len-arr[i]*2;
            }
        }
        if(arr[7]>=0){
            len = len-arr[7]*3;
        }

        System.out.println(len);
    }
}