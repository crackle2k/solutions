import java.io.*;
import java.util.*;

public class AnotherSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Integer[] numbers = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers, (a, b) -> {
            if (a % 10 != b % 10) {
                return (a % 10) - (b % 10);
            }
            return b - a;
        });

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
