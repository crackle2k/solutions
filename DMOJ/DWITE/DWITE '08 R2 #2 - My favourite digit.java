import java.io.*;
import java.util.*;

public class MyFavouriteDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {

            String number = br.readLine();
            int largest = 0;
            for (int j = 0; j < number.length(); j++) {
                char character = number.charAt(j);
                int digit = character - '0';
                if (digit > largest) { largest = digit; }
            }

            System.out.println(largest);
        }

    }
}
