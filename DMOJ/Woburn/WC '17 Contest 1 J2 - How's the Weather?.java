import java.util.Scanner;

public class HowSTheWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = (N * 9/5) + 32;
        System.out.println(F);

        sc.close();
    }
}
