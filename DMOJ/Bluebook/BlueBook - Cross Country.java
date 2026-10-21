import java.io.*;
import java.util.*;

public class CrossCountry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line.equals("MG")) {
            System.out.println("midget girls");
        } else if (line.equals("MB")) {
            System.out.println("midget boys");
        } else if (line.equals("JG")) {
            System.out.println("junior girls");
        } else if (line.equals("JB")) {
            System.out.println("junior boys");
        } else if (line.equals("SG")) {
            System.out.println("senior girls");
        } else if (line.equals("SB")) {
            System.out.println("senior boys");
        } else {
            System.out.println("invalid code");
        }

    }
}
