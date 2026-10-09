// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
        pw.println("Ready");

		while (true) {
            String pair = r.readLine();
            if (pair.equals("  ")) { break; }

            if ((pair.charAt(0) == 'd' && pair.charAt(1) == 'b') || (pair.charAt(0) == 'p' && pair.charAt(1) == 'q') || (pair.charAt(0) == 'b' && pair.charAt(1) == 'd') || (pair.charAt(0) == 'q' && pair.charAt(1) == 'p')) { pw.println("Mirrored pair"); }
            else if (pair.charAt(0) == pair.charAt(1)) { pw.println("Ordinary pair"); }
            else { pw.println("Ordinary pair"); }
        }

		pw.close();
	}
}
