import java.io.*;
import java.util.*;

public class BikingAndHiking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String given = br.readLine();
        int distance = 0;

        for (int i = 0; i < N; i++) {
            
            if (given.charAt(i) == 'U') { 
                if (K > 0) {
                    K--;
                }
            }
            else if (given.charAt(i) == 'D') {
                K++;
            }

            if (K == 0) {
                distance++;
            }
        }

        System.out.println(distance);
    }
}
