// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String line = r.readLine();
        String result = "";

        for (char letter : line.toCharArray()) {
            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
                String chunk = "";
                chunk += letter;

                if (letter <= 'c') { chunk += 'a'; }
                else if (letter <= 'g') { chunk += 'e'; }
                else if (letter <= 'l') { chunk += 'i'; }
                else if (letter <= 'r') { chunk += 'o'; }
                else { chunk += 'u'; }

                char nextConst = (char)(letter + 1);
                if (nextConst == 'a' || nextConst == 'e' || nextConst == 'i' || nextConst == 'o' || nextConst == 'u') { nextConst = (char)(nextConst + 1); }
                else if (nextConst == '{') { nextConst = 'z'; }
                chunk += nextConst;

                result += chunk;

            } else { result += letter; }
        }

        pw.println(result);

		pw.close();
	}
}
