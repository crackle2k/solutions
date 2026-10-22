import java.io.*;
import java.util.*;

public class LilJami {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] cups = new int[N];
        for (int i = 0; i < K; i++) {
            int cupIndex = Integer.parseInt(br.readLine());
            cups[cupIndex]++;
        }

        int[] prefix = new int[N + 1];
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + cups[i];
        }

        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(prefix[b + 1] - prefix[a]);
        }
    }
}
