import java.util.Scanner;

public class CoreDrill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int H = sc.nextInt();

        double volume = Math.PI * R * R * H / 3;
        System.out.printf("%.2f", volume);
        System.out.println();

        sc.close();
    }
}
