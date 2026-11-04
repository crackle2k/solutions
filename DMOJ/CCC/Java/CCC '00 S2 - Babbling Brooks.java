// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        ArrayList<Double> flows = new ArrayList<>();
		int initialStreams = Integer.parseInt(r.readLine());

        for (int i = 0; i < initialStreams; i++) {
            double flow = Double.parseDouble(r.readLine());
            flows.add(flow);
        }

        while (true) {

            int command = Integer.parseInt(r.readLine());
            if (command == 77) {
                break;
            }

            if (command == 99) {
                int index = Integer.parseInt(r.readLine());
                double percent = Double.parseDouble(r.readLine());
                double stream = flows.get(index - 1);
                double value1 = stream * (percent / 100.0);
                double value2 = stream - value1;

                flows.set(index - 1, (value1));
                flows.add(index, (value2));

            } else if (command == 88) {
                int index = Integer.parseInt(r.readLine());
                double value1 = flows.get(index - 1);
                double value2 = flows.get(index);
                double value = value1 + value2;

                flows.remove(index);
                flows.set(index - 1, value);
            }

        }

        for (int i = 0; i < flows.size(); i++) {
            pw.print("" + Math.round(flows.get(i)) + " ");
        }

        pw.println();
		pw.close();
	}
}
