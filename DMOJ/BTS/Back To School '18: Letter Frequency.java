import java.io.*;
import java.util.*;

public class BackToSchool18LetterFrequency {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String sentence = br.readLine();
        int n = sentence.length();
        
        int[][] counts = new int[n + 1][26];
        
        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);
            
            for (int j = 0; j < 26; j++) {
                counts[i + 1][j] = counts[i][j];
            }
            
            if (ch >= 'a' && ch <= 'z') {
                counts[i + 1][ch - 'a']++;
            }
        }
        
        int Q = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < Q; i++) {
            String[] query = br.readLine().split(" ");
            int start = Integer.parseInt(query[0]);
            int end = Integer.parseInt(query[1]);
            char targetChar = query[2].charAt(0);
            
            int charIndex = targetChar - 'a';
            int count = counts[end][charIndex] - counts[start - 1][charIndex];
            
            System.out.println(count);
        }
    }
}
