import java.io.*;
import java.util.*;

public class NotEnoughUsers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int result = N;
        for (int i = 0; i < D; i++) {
            result *= K;
        }
        System.out.println(result);

    }
}
