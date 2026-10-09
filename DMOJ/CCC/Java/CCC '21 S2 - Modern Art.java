// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int M = Integer.parseInt(r.readLine());
		int N = Integer.parseInt(r.readLine());
		int K = Integer.parseInt(r.readLine());
        
        boolean rows[] = new boolean[M];
        boolean cols[] = new boolean[N];
		
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            char line = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken()) - 1;

            if (line == 'R') {
                rows[number] = !rows[number];
            } else if (line == 'C') {
                cols[number] = !cols[number];
            }
        }

        int R = 0, C = 0;

        for (boolean row : rows) {
            if (row) { R++; }
        }

        for (boolean col : cols) {
            if (col) { C++; }
        }

        int goldCount = R * (N - C) + (M - R) * C;

        pw.println(goldCount);
        
		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
