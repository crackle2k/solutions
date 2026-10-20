import java.io.*;
import java.util.*;

public class MissionBriefing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String sentence = br.readLine();
        int result = 0;
        if (sentence.contains("001")) { result++; }
        if (sentence.contains("002")) { result++; }
        if (sentence.contains("003")) { result++; }
        if (sentence.contains("004")) { result++; }
        if (sentence.contains("005")) { result++; }
        if (sentence.contains("006")) { result++; }
        if (sentence.contains("007")) { result++; }
        if (sentence.contains("008")) { result++; }
        if (sentence.contains("009")) { result++; }

        System.out.println(result);

    }
}
