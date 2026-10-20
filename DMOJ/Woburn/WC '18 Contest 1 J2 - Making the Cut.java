import java.io.*;
import java.util.*;

public class MakingTheCut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean madeIt = false;
        String S = br.readLine();
        for (int i = 0; i < 5; i++) {
            if (br.readLine().equals(S)) { madeIt = true; }
        }

        if (madeIt) { System.out.println("Y"); }
        else { System.out.println("N"); }

    }
}
