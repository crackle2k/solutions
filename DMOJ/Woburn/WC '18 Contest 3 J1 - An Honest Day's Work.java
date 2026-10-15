import java.util.Scanner;

public class AnHonestDaySWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int B = sc.nextInt();
        int D = sc.nextInt();

        int money = ((P / B) * D) + (P % B);
        System.out.println(money);

        sc.close();
    }
}
