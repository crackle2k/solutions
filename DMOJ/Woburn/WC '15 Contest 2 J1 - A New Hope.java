import java.util.Scanner;

public class ANewHope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() - 1;
        System.out.print("A long time ago in a galaxy ");
        for (int i = 0; i < N; i++) { 
            System.out.print("far, ");

        }
        System.out.print("far away...");

        sc.close();
    }
}
