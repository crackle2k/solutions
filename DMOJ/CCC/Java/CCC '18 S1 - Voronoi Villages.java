import java.util.Arrays;
import java.util.Scanner;

public class VoronoiVillages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] villages = new int[N];
        for (int i = 0; i < N; i++) {
            villages[i] = sc.nextInt();
        }
        Arrays.sort(villages);

        double lowestArea = (villages[2] - villages[1]) / 2.0 + (villages[1] - villages[0]) / 2.0;
        for (int i = 1; i < N - 1; i++) {
            double area = (villages[i + 1] - villages[i]) / 2.0 + (villages[i] - villages[i - 1]) / 2.0;
            if (area < lowestArea) { lowestArea = area; }
        }

        System.out.printf("%.1f", lowestArea);
        System.out.println();
        sc.close();
    }
}
