import java.util.Scanner;

public class CCAndCheeseKun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int C = sc.nextInt();
        String rating = "";

        if (W == 3 && C >= 95) {
            rating = "absolutely";
        } else if (W == 1 && C <= 50) {
            rating = "fairly";
        } else {
            rating = "very";
        }

        System.out.println("C.C. is " + rating + " satisfied with her pizza.");

        sc.close();
    }
}
