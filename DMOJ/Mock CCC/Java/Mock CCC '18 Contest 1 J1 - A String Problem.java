// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
        boolean found = false;

        while (!found) {
            int greater = N + 1;
            if (String.valueOf(greater).contains("0")) {
                N = greater;
            } else {
                pw.println(greater);
                found = true;
            }
        }
		
		pw.close();
	}
}
