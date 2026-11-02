import java.io.*;
import java.util.*;

public class Utrka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        HashMap<String, Integer> counts = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            counts.put(name, counts.getOrDefault(name, 0) + 1);
        }

        for (int i = 0; i < n - 1; i++) {
            String name = br.readLine();
            counts.put(name, counts.get(name) - 1);
        }

        for (Map.Entry<String, Integer> name : counts.entrySet()) {
            if (name.getValue() == 1) {
                out.println(name.getKey());
                break;
            }
        }

        out.flush();
    }
}
