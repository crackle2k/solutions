// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int C = Integer.parseInt(r.readLine());

        while (C != 0) {

            int area = C;
            for (int width = (int)Math.sqrt(area); width >= 1; width--) {
                if (area % width == 0) {
                    int length = area / width;
                    pw.println("Minimum perimeter is " + (length + width + length + width) + " with dimensions " + width + " x " + length);
                    break;
                }
            }


            C = Integer.parseInt(r.readLine());
        }

		pw.close();
	}
}
