// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
        
        String line = r.readLine();
        if (line.contains("CCC")) { System.out.println("NO"); } else { System.out.println("YES"); }
        

		pw.close();
	}
}
