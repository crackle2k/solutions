import java.io.*;
import java.util.*;

public class FirstBlank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            boolean found = false;
            int val = 0;
            for (int j = 0; j < line.length(); j++) {

                if (line.charAt(j) == ' ' && found == false) {
                    val = j + 1;
                    found = true;
                }
            }

            out.println(val);
        } 

        out.flush();
    }
}
