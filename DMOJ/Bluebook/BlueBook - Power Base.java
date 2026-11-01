import java.io.*;
import java.util.*;

public class PowerBase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            double base = Double.parseDouble(st.nextToken());
            double power = Double.parseDouble(st.nextToken());

            double result = Math.pow(base, power);
            out.printf("%.2f%n", result);
        }

        out.flush();
    }
}
