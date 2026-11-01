import java.io.*;
import java.util.*;

public class Direction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int degree = Integer.parseInt(br.readLine());
            if (degree > 0 && degree <= 45) {
                out.println('N');
            } else if (degree > 45 && degree <= 135) {
                out.println('E');
            } else if (degree > 135 && degree <= 225) {
                out.println('S');
            } else if (degree > 225 && degree <= 314 ) {
                out.println('W');
            } else {
                out.println('N');
            }
        }

        out.flush();
    }
}
