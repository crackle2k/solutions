// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int N = Integer.parseInt(r.readLine());
        int i = Integer.parseInt(r.readLine());
        int j = Integer.parseInt(r.readLine());

        if (Math.abs(i * i - N) < Math.abs(j * j - N)) { System.out.println("1"); } else { System.out.println("2"); }

		pw.close();
	}
}
