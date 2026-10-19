import java.io.*;
import java.util.*;

public class VictorSMoralDilemma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] numbers = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i + 1] = numbers[i] + Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N;

        for (int i = 0; i < D; i++) {
            int div = Integer.parseInt(br.readLine());
            int first = numbers[left + div] - numbers[left];
            int second = numbers[right] - numbers[left + div];

            if (first >= second) {
                System.out.println(first);
                left += div;
            } else {
                System.out.println(second);
                right = left + div;
            }
            
        }

    }
}
