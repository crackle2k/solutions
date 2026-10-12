import java.util.Scanner;

public class CccWordHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int total = 0;
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    for (int d = 0; d < 8; d++) {
                        total += search(grid, i, j, word, dr[d], dc[d], false, 0);
                    }
                }
            }
        }

        System.out.println(total);

        sc.close();
    }

    public static boolean is_valid(char[][] grid, int row, int col) {
        if (0 > row|| row >= grid.length || 0 > col || col >= grid[0].length) {
            return false;
        } else {
            return true;
        }
    }

    public static int search(char[][] grid, int row, int col, String word, int dr, int dc, boolean turned, int letter) {
        if (!is_valid(grid, row, col)) {
            return 0;
        }

        if (grid[row][col] != word.charAt(letter)) {
            return 0;
        }

        if (letter == word.length() - 1) {
            return 1;
        }

        int count = 0;
        count += search(grid, row + dr, col + dc, word, dr, dc, turned, letter + 1);

        if (!turned && letter >= 1) {
            count += search(grid, row + dc, col - dr, word, dc, -dr, true, letter + 1);
            count += search(grid, row - dc, col + dr, word, -dc, dr, true, letter + 1);
        }

        return count;
    }
}
