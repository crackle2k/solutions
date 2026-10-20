import java.io.*;
import java.util.*;

public class AFistfulOfQuarters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int D = Integer.parseInt(br.readLine());
        int Q = Integer.parseInt(br.readLine());

        if (Q / 4 > D) { System.out.println(0); }
        else {
            double needed = (double)(Q) / 4.00;
            int result = (int)((D - needed) * 4);
            System.out.println(result);
        }

    }
}
