import java.util.Scanner;

public class SumacSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        int terms = 2;
        while (true) {
            int t3 = t1 - t2;
            if (t3 > t2) {
                terms++;
                break;
            } else {
                t1 = t2;
                t2 = t3;
                terms++;
            }
        }

        System.out.println(terms);

        sc.close();
    }
}
