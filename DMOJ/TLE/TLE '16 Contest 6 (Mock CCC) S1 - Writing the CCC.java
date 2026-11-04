import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(r.readLine());

        HashMap<String, Integer> order = new HashMap<>();
        ArrayList<ArrayList<Integer>> problems = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String question = r.readLine();
            order.put(question, i);
            problems.add(new ArrayList<>());
        }

        int n = Integer.parseInt(r.readLine());

        for (int i = 1; i <= n; i++) {
            String word = r.readLine();
            int index = order.get(word);
            problems.get(index).add(i);
        }

        for (ArrayList<Integer> group : problems) {
            for (int index : group) {
                pw.println(index);
            }
        }

        pw.close();
    }
}
