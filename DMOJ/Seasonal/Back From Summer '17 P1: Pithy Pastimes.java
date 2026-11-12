import java.io.*;
import java.util.*;

public class BackFromSummer17P1PithyPastimes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            String word = st.nextToken();
            if (word.length() <= 10) { count++; }
        }

        out.println(count);
        out.flush();
    }
}
