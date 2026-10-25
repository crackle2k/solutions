import java.io.*;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            boolean valid = false;
            int year = Integer.parseInt(br.readLine());
            if (year % 400 == 0) {
                valid = true;
            } else if (year % 4 == 0) {
                if (year % 100 != 0) {
                    valid = true;
                }
            }

            System.out.println(valid ? 1 : 0);
        }

    }
}
