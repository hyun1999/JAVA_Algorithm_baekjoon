import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = Arrays.stream(br.readLine().split("")).map(c -> Character.isUpperCase(c.charAt(0)) ? c.toLowerCase() : c.toUpperCase()).collect(Collectors.joining());
        System.out.println(st);
    }
}
