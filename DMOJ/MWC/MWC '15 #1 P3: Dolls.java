import java.io.*;
import java.util.*;

public class Mwc151P3Dolls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] freq = new int[101];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            freq[num]++;
        }
        
        int highest = 0, highestVal = 0;
        int lowest = 0, lowestVal = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 100; i++) {
            if (freq[i] == 0) continue;
            
            if (freq[i] >= highestVal) {
                highest = i;
                highestVal = freq[i];
            }
            if (freq[i] < lowestVal) {
                lowest = i;
                lowestVal = freq[i];
            }
        }
        
        out.println(Math.abs(highest - lowest));
        out.flush();
    }
}
