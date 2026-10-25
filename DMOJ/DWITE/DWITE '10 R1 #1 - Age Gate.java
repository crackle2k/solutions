import java.io.*;
import java.util.*;

public class AgeGate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            boolean valid = false;
            if (year < 1997) {
                valid = true;
            } else if (year == 1997) {
                if (month < 10) {
                    valid = true;
                } else if (month == 10) {
                    if (day <= 27) { valid = true; }
                }
            }

            System.out.println(valid ? "old enough" : "too young");
        }

    }
}
