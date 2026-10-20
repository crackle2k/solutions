import java.io.*;
import java.util.*;

public class TriangleCount {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int zz = 0; zz < 5; zz++) {
            int N = Integer.parseInt(br.readLine());
            char[][] grid = new char[N][N];

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = 0; j < N; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }

            dp = new int[N][N];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }

            int triangles = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    triangles += find(grid, i, j, N);
                }
            }

            System.out.println(triangles);
        }
    }

    public static int find(char[][] grid, int i, int j, int N) {
        if (!is_valid(grid, i, j, N)) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (j == 0 || j == N - 1 || i == N - 1) {
            return dp[i][j] = 1;
        }

        return dp[i][j] = 1 + Math.min(find(grid, i + 1, j - 1, N), Math.min(find(grid, i + 1, j, N), find(grid, i + 1, j + 1, N)));
    }

    public static boolean is_valid(char[][] grid, int i, int j, int N) {
        if (i < N && i >= 0 && j < N && j >= 0 && grid[i][j] != '.') {
            return true;
        } else { return false; }
    }

    //used my same solution from troyangles idk if thats cheating or not
}
