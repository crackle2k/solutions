// Source: https://usaco.guide/general/io

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int N = Integer.parseInt(r.readLine());
		String first = r.readLine();
        String result = "";

        if (N % 2 != 0) { result = first; }
        else {
            if (first.equals("left")) { result = "right"; }
            else if (first.equals("right")) { result = "left"; }
        }

        pw.println(result);
		pw.close();
	}
}
