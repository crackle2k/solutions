// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());

        pw.println(a + b);
        pw.println(a - b);
        pw.println(a * b);

		pw.close();
	}
}
