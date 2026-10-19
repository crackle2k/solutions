import java.io.*;
import java.util.*;

public class MonkeyShopping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if (B > A && D > C) {
            System.out.println("Go to the department store");
        } else if (B > A) {
            System.out.println("Go to the grocery store");
        } else if (D > C) {
            System.out.println("Go to the pharmacy");
        } else {
            System.out.println("Stay home");
        }
    }
}
