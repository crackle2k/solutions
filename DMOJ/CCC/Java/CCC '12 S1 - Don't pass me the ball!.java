// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int J = Integer.parseInt(st.nextToken());
		
        if (J < 4) { pw.println(0); }
        else {
            int result = (J - 1) * (J - 2) * (J - 3) / 6;
            pw.println(result);
        }

		pw.close();
	}
}
