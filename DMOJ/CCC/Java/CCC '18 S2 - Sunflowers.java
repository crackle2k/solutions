import java.util.Scanner;

public class Sunflowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] table = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j ++) {
                table[i][j] = sc.nextInt();
            }
        }

        int[][] result = {};
        for (int i = 0; i < 4; i++) {
            if (is_valid(table)) {
                result = table;
            } else {
                table = turn_table(table);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j ++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static boolean is_valid(int[][] table) {
        boolean valid = true;
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i][0] > table[i + 1][0]) {
                valid = false;
            }

            for (int j = 0; j < table.length - 1; j++) {
                if (table[i][j] > table[i][j + 1]) {
                    valid = false;
                }
            }
            
        }

        return valid;
    }

    public static int[][] turn_table(int[][] table) {
        int length = table.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = table[i][j];
                table[i][j] = table[j][i];
                table[j][i] = temp;
            }
        }

        for (int i = 0; i < length; i++) {
            int left = 0;
            int right = length - 1;
            while (left < right) {
                int temp = table[i][left];
                table[i][left] = table[i][right];
                table[i][right] = temp;
                left++;
                right--;
            }
        }

        return table;
    }
}
