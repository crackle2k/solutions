import java.util.Scanner;

public class ASimplexProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Uc = sc.nextInt();
        int Um = sc.nextInt();
        int K = sc.nextInt();

        if (Um > Uc) {
            System.out.println(Um * K);
        } else {
            System.out.println(Uc * K);
        }

        sc.close();
    }
}
