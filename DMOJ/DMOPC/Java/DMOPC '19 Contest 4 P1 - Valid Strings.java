import java.io.*;
import java.util.*;

public class ValidStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {

            String line = br.readLine();
            ArrayList<Character> check = new ArrayList<>();
            boolean failed = false;

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '(') { check.add('('); }
                else if (line.charAt(j) == ')') {
                    if (check.isEmpty()) { 
                        failed = true;
                        break;
                    }
                    else {
                        check.removeLast();
                    }
                    
                }
            }

            if (check.isEmpty() && !failed) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
