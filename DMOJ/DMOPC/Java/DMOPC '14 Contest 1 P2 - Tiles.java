import java.util.Scanner;

public class Tiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int length = sc.nextInt();
        int tileLength = sc.nextInt();
        
        int result = (length / tileLength) * (width / tileLength);

        System.out.println(result);

        sc.close();
    }
}
