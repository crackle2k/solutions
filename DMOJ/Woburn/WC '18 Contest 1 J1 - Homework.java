import java.io.*;
import java.util.*;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        if (A * M <= T) { System.out.println("Y"); }
        else { System.out.println("N"); }

    }
}
