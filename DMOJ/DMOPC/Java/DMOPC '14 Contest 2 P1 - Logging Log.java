import java.io.*;
import java.util.*;

public class LoggingLog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int D = Integer.parseInt(br.readLine());
        for (int i = 0; i < D; i++) {
            int sum = 0;
            int T = Integer.parseInt(br.readLine());
            for (int j = 0; j < T; j++) {
                sum += Integer.parseInt(br.readLine());
            }

            if (sum == 0) { System.out.println("Weekend"); }
            else { System.out.println("Day " + (i + 1) + ": " + sum); }
        }
    }
}
