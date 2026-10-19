import java.io.*;
import java.util.*;

public class Deforestation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] prefix = new int[N + 1];
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + Integer.parseInt(br.readLine());
        }

        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int result = prefix[end + 1] - prefix[start];
            System.out.println(result);
        }

    }
}
