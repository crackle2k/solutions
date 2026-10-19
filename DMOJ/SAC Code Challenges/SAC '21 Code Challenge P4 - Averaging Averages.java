import java.io.*;
import java.util.*;

public class AveragingAverages {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int queries = Integer.parseInt(st.nextToken());
        int[] courses = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            courses[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < queries; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            boolean reached = false;
            int index = start - 1;
            int sum = 0;
            while (!reached) {
                if (index + 1 == end) {
                    reached = true;
                }

                sum += courses[index];
                index++;
            }

            int result = sum / (end - start + 1);
            System.out.println(result);
        }

    }
}
