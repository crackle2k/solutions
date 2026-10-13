import java.util.Scanner;

public class UlamSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] grid = new int[N][N];
        int row = N / 2;
        int col = (N - 1) / 2;
        grid[row][col] = 1;
        
        int[] dr = {0, -1, 0, 1};
        int[] dc = {1, 0, -1, 0};

        int nums = N * N;
        int steps = 1;
        int direction = 0;
        int num = 1;
        while (num < nums) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
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

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.printf("%3d", grid[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
