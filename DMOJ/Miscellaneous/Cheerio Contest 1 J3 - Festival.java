import java.io.*;
import java.util.*;

public class Festival {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                char letter = line.charAt(j);
                grid[i][j] = letter;
            }
        }

        int[] counts = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'S') {
                    counts[j] += 1;
                }
            }
        }

        char[][] newGrid = new char[N][N];
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                if (counts[j] != 0) {
                    newGrid[i][j] = 'S';
                    counts[j]--;
                } else {
                    newGrid[i][j] = '.';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                out.print(newGrid[i][j]);
            }
            out.println();
        }

        out.flush();
    }
}
