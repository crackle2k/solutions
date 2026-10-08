// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(r.readLine());
        for (int i = 0; i < N; i ++) {

		    StringTokenizer st = new StringTokenizer(r.readLine());
            int year = Integer.parseInt(st.nextToken());
		    int month = Integer.parseInt(st.nextToken());
		    int day = Integer.parseInt(st.nextToken());
            boolean valid = false;

            if (2007 - year > 18) {
                valid = true;
            } else if (2007 - year == 18) {
                if (month < 2) {
                    valid = true;
                } else if (month == 2) {
                    if (day <= 27) {
                        valid = true;
                    }
                }
            }

            if (valid) { pw.println("Yes"); } else { pw.println("No"); }
        }
		

		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
