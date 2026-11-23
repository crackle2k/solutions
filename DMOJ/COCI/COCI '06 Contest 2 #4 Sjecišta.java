import java.io.*;
import java.util.*;

public class Sjeci_u0161ta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        long result = n * (n - 1) * (n - 2) * (n - 3) / 24;

        out.println(result);
        out.flush();
    }
}
