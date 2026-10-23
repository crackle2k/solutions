import java.io.*;
import java.util.*;

public class TheGenevaConfection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int zz = 0; zz < T; zz++) {
            int N = Integer.parseInt(br.readLine());
            int[] carts = new int[N];
            Stack<Integer> branch = new Stack<>();
            
            for (int i = 0; i < N; i++) {
                carts[i] = Integer.parseInt(br.readLine());
            }
            
            int current = 1;
            int index = N - 1; 
            
            while (index >= 0 || (!branch.isEmpty() && branch.peek() == current)) {
                if (!branch.isEmpty() && branch.peek() == current) {
                    branch.pop();
                    current++;
                } else if (carts[index] == current) {
                    index--;
                    current++;
                } else {
                    branch.push(carts[index]);
                    index--;
                }
            }
            
            if (current == N + 1) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
