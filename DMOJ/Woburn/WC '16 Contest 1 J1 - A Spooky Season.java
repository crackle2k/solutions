import java.util.Scanner;

public class ASpookySeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.print("sp");
        for (int i = 0; i < N; i++) {
            System.out.print("o");
        }
        System.out.print("ky");
        System.out.println();

        sc.close();
    }
}
