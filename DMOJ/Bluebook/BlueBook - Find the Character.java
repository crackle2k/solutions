import java.io.*;
import java.util.*;

public class FindTheCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        char theChar = br.readLine().charAt(0);
        String original = br.readLine();
        String line = original.toLowerCase();

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == theChar) {
                count++;
            }
        }

        System.out.println(original);
        System.out.println(count);
    }
}
