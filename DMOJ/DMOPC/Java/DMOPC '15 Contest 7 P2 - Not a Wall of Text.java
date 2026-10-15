import java.util.Scanner;

public class NotAWallOfText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String line = sc.nextLine();
        String[] words = line.split("\\s+");

        for (String word : words) {
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
