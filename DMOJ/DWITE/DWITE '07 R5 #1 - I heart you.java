import java.io.*;
import java.util.*;

public class IHeartYou {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {

            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                System.out.print(" ~.~ ");
            }
            System.out.println();
            for (int j = 0; j < N; j++) {
                System.out.print("`   `");
            }
            System.out.println();
            for (int j = 0; j < N; j++) {
                System.out.print(" \\./ ");
            }
            System.out.println();
        }

    }
}
