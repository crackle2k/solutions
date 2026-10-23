import java.io.*;
import java.util.*;

public class Tarifa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int left = X;

        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(br.readLine());
            left += X - p;
        }

        System.out.println(left);
    }
}
