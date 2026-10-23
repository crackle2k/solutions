import java.util.Scanner;

public class HiddenPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int N = line.length();
        int maxLength = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                String sub = line.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }

        System.out.println(maxLength);

        sc.close();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
