import java.io.*;
import java.util.*;

public class MediaList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        HashSet<String>[] mediaLists = (HashSet<String>[]) new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            mediaLists[i] = new HashSet<>();
        }
        
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (type == 1) {
                if (mediaLists[index].contains(name)) {
                    out.println(1);
                } else {
                    out.println(0);
                }
            } else if (type == 2) {
                mediaLists[index].add(name);
            }
        }


        out.flush();
    }
}
