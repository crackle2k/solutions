import java.io.*;
import java.util.*;

public class AromaticNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        String line = br.readLine();
        int sum = 0;
        for (int i = 0; i < line.length(); i += 2) {
            int arabic = line.charAt(i) - '0';
            int romanNum = convert(line.charAt(i + 1));

            if (i + 3 < line.length() &&
                convert(line.charAt(i + 3)) > romanNum) {
                sum -= arabic * romanNum;
            } else {
                sum += arabic * romanNum;
            }
        }

        out.println(sum);
        out.flush();
    }

    public static int convert(char letter) {
        if (letter == 'I') { return 1; }
        else if (letter == 'V') { return 5; }
        else if (letter == 'X') { return 10; }
        else if (letter == 'L') { return 50; }
        else if (letter == 'C') { return 100; }
        else if (letter == 'D') { return 500; }
        else if (letter == 'M') { return 1000; }
        else { return 0; }
    }
}
