// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        int max = 0, min = Integer.MAX_VALUE;
        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(r.readLine());
            if (num < min) { min = num; }
            if (num > max) { max = num; }
        }

        pw.println(min);
        pw.println(max);

		pw.close();
	}
}
