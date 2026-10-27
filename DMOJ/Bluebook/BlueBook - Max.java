import java.io.*;
import java.util.*;

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        double max = Double.parseDouble(br.readLine());
        for (int i = 0; i < T - 1; i++) {
            double num = Double.parseDouble(br.readLine());
            if (num > max) { max = num; }
        }

        out.printf("%.4f\n", max);
        out.flush();
    }
}
