import java.io.*;
import java.util.*;

public class SnowboardingChampionship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int andrewTime = 0, tommyTime = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (X < A) { andrewTime++; }
            else { andrewTime += 2; }

            if (Y < B) { tommyTime++; }
            else { tommyTime += 2; }
        }

        if (andrewTime > tommyTime) {
            System.out.println("Tommy wins!");
        } else if (andrewTime < tommyTime) {
            System.out.println("Andrew wins!");
        } else {
            System.out.println("Tie!");
        }
    }
}
