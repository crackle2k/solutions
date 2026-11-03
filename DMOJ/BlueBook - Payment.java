// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch = 'A'; ch <= 'F'; ch++) {
            map.put(ch, 0);
        }

        while (true) {
            
            int num = Integer.parseInt(r.readLine());
            if (num == -1) {
                break;
            }

            if (num > 49999) {
                map.put('F', map.get('F') + 1);
            } else if (num > 39999) {
                map.put('E', map.get('E') + 1);
            } else if (num > 29999) {
                map.put('D', map.get('D') + 1);
            } else if (num > 19999) {
                map.put('C', map.get('C') + 1);
            } else if (num > 9999) {
                map.put('B', map.get('B') + 1);
            } else {
                map.put('A', map.get('A') + 1);
            }
        }

        for (char ch = 'A'; ch <= 'F'; ch++) {
            pw.println(map.get(ch));
        }

		pw.close();
	}
}
