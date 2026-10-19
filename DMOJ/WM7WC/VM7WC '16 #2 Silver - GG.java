import java.io.*;
import java.util.*;

public class Gg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String gString = br.readLine();

        int N = gString.length();
        int[] prefix = new int[N + 1];

        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i];
            if (gString.charAt(i) == 'G') {
                prefix[i + 1]++;
            }
        }

        int queries = Integer.parseInt(br.readLine());
        for (int i = 0; i < queries; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int gCount = prefix[end + 1] - prefix[start];
            System.out.println(gCount);
        }
    }
}
