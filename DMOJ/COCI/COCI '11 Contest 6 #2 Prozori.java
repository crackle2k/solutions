// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
        int[] types = {0, 0, 0, 0, 0};
        char[][] grid = new char[5 * M + 1][5 * N + 1];

        for (int i = 0; i < M * 5 + 1; i++) {
            String line = r.readLine();
            for (int j = 0; j < N * 5 + 1; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
		
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i * 5 + 1][j * 5 + 1] == '.') { types[0]++; }
                else if (grid[i * 5 + 2][j * 5 + 1] == '.') { types[1]++; }
                else if (grid[i * 5 + 3][j * 5 + 1] == '.') { types[2]++; }
                else if (grid[i * 5 + 4][j * 5 + 1] == '.') { types[3]++; }
                else if (grid[i * 5 + 4][j * 5 + 1] == '*') { types[4]++; }
            }
        }


        pw.println(types[0] + " " + types[1] + " " + types[2] + " " + types[3] + " " + types[4]);
		pw.close();
	}
}
