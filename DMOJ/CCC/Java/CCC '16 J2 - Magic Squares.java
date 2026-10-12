import java.util.Scanner;

public class MagicSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        boolean magic = true;
        int sum = grid[0][0] + grid[0][1] + grid[0][2] + grid[0][3];
        for (int i = 0; i < 4; i++) {
            if (grid[i][0] + grid[i][1] + grid[i][2] + grid[i][3] != sum) {
                magic = false;
            }
            if (grid[0][i] + grid[1][i] + grid[2][i] + grid[3][i] != sum) {
                magic = false;
            }
        }

        if (magic) { System.out.println("magic"); }
        else { System.out.println("not magic"); }

        sc.close();
    }
}
