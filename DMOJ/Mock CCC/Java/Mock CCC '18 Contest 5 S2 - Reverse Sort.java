import java.io.*;
import java.util.*;

public class ReverseSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int swaps = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (numbers[i] < numbers[j]) {
                    swaps++;
                }
            }
        }

        System.out.println(swaps);

    }
}
