import java.io.*;
import java.util.*;

public class AbsolutelyAcidic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            table.put(num, table.getOrDefault(num, 0) + 1);
        }

        int highest = 0;
        int secondHighest = 0;

        for (int freq : table.values()) {
            if (freq > highest) {
                secondHighest = highest;
                highest = freq;
            } else if (freq > secondHighest && freq < highest) {
                secondHighest = freq;
            }
        }

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int key : table.keySet()) {
            int freq = table.get(key);

            if (freq == highest) {
                first.add(key);
            } else if (freq == secondHighest) {
                second.add(key);
            }
        }

        Collections.sort(first);
        Collections.sort(second);

        int answer;

        if (first.size() >= 2) {
            answer = first.get(first.size() - 1) - first.get(0);
        } else {
            int mostFrequent = first.get(0);
            answer = Math.max(Math.abs(mostFrequent - second.get(0)), Math.abs(mostFrequent - second.get(second.size() - 1)));
        }

        out.println(answer);
        out.flush();
    }
}
