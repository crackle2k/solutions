import java.util.Scanner;

public class ColdCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String result = "";
            String line = sc.next();
            int letter = 0;
            char currentChar = line.charAt(0);
            int letterCount = 0;
            while (letter < line.length()) {
                if (currentChar == line.charAt(letter)) {
                    letterCount++;
                    letter++;
                } else {
                    result += letterCount + " " + currentChar + " ";
                    currentChar = line.charAt(letter);
                    letterCount = 0;
                }
            }

            result += letterCount + " " + currentChar + " ";
            System.out.println(result.trim());
        }
        
        sc.close();
    }
}
