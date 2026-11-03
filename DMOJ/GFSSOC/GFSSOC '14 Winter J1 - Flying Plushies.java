// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(r.readLine());
        int m = Integer.parseInt(r.readLine());
        int count = 0;

        for (int i = 0; i < m; i++) {
            int h = Integer.parseInt(r.readLine());
            if (h >= n) { count++; }
        }

        pw.println(count);
		pw.close();
	}
}
