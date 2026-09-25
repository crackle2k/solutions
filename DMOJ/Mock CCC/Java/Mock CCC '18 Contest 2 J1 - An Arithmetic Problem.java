// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int a = Integer.parseInt(st.nextToken());
        st.nextToken();
		int b = Integer.parseInt(st.nextToken());
        st.nextToken();
		int c = Integer.parseInt(st.nextToken());

        if (a + b == c) {
            pw.println("True");
        } else {
            pw.println("False");
        }
		pw.close();
	}
}
