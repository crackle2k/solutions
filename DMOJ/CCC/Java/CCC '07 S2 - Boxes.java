import java.util.Arrays;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] sizes = new int[N][3];
        for (int i = 0; i < N; i++) {
            sizes[i][0] = sc.nextInt();
            sizes[i][1] = sc.nextInt();
            sizes[i][2] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[][] items = new int[M][3];
        for (int i = 0; i < M; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
            items[i][2] = sc.nextInt();
        }

        for (int[] item : items) {
            int lowest = Integer.MAX_VALUE;
            boolean fit = false;
            for (int[] size : sizes) {
                if (item[0] * item[1] * item[2] <= size[0] * size[1] * size[2]) {
                    int[] check = {item[0], item[1], item[2]};
                    int[] compare = {size[0], size[1], size[2]};

                    Arrays.sort(check);
                    Arrays.sort(compare);

                    if (check[0] <= compare[0] && check[1] <= compare[1] && check[2] <= compare[2]) {

                        fit = true;
                        if (size[0] * size[1] * size[2] < lowest) {
                            lowest = size[0] * size[1] * size[2];
                        }
                    }
                }
            }

            if (fit) {
                System.out.println(lowest);
            } else {
                System.out.println("Item does not fit.");
            }
        }

        sc.close();
    }
}
