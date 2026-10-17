import java.util.Scanner;

public class AGeometryProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long Y = sc.nextLong();
        long area = X * Y;

        System.out.printf("%d.%02d%n", area / 4, (area % 4) * 25);

        sc.close();
    }
}
