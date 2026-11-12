import java.io.*;
import java.util.*;

public class ExactDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        ArrayList<Integer> possible = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                possible.add(i);
            }
        }

        for (int value : possible) {
            out.println(value);
        }

        out.flush();
    }
}
