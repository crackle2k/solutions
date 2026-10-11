// Source: https://usaco.guide/general/io

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(r.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(r.readLine());
            int b = Integer.parseInt(r.readLine());
            int c = Integer.parseInt(r.readLine());
            
            String[] subjects = new String[a];
            String[] verbs = new String[b];
            String[] objects = new String[c];

            for (int j = 0; j < a; j++) { subjects[j] = r.readLine(); }
            for (int j = 0; j < b; j++) { verbs[j] = r.readLine(); }
            for (int j = 0; j < c; j++) { objects[j] = r.readLine(); }

            for (int j = 0; j < a; j++) {
                for (int k = 0; k < b; k++) {
                    for (int l = 0; l < c; l++) {
                        pw.println(subjects[j] + " " + verbs[k] + " " + objects[l] + ".");
                    }
                }
            }
        }

		
        
		pw.close();
	}
}
