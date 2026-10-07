// Source: https://usaco.guide/general/io

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		double V = Double.parseDouble(r.readLine());
		double P = Double.parseDouble(r.readLine());
		double percent = V * (P / 100);

        pw.println(V - percent);
        pw.println(V + percent);
		
		pw.close();
	}
}
