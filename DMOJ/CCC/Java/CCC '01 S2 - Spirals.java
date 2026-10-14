import java.util.Scanner;

public class Spirals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int N = 2 * (int)Math.ceil(Math.sqrt(end - start + 1)) + 1;
        int grid[][] = new int[N][N];

        int row = N / 2;
        int col = N / 2;
        grid[row][col] = start;
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};

        int steps = 1;
        int direction = 0;
        int num = start;
        while (num < end) {
            for (int i = 0; i < 2 && num < end; i++) {
                for (int j = 0; j < steps && num < end; j++) {
                    row += dr[direction];
                    col += dc[direction];

                    num++;
                    if (row >= 0 && row < N && col >= 0 && col < N) {
                        grid[row][col] = num;
                    }
                }

                direction = (direction + 1) % 4;
            }

            steps++;
        }

        int minRow = N, maxRow = 0;
        int minCol = N, maxCol = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] != 0) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                if (grid[i][j] == 0) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%3d", grid[i][j]);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
