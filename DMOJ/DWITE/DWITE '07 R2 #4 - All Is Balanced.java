import java.io.*;
import java.util.*;

public class AllIsBalanced {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            
            ArrayList<Character> stack = new ArrayList<>();
            boolean balanced = true;
            
            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.add(ch);
                } else if (ch == ')' || ch == ']' || ch == '}') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char open = stack.removeLast();
                    if ((ch == ')' && open != '(') || 
                        (ch == ']' && open != '[') || 
                        (ch == '}' && open != '{')) {
                        balanced = false;
                        break;
                    }
                }
            }
            
            if (balanced && stack.isEmpty()) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        }

    }
}
