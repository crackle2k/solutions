import java.io.*;
import java.util.*;

public class TheEmpireStrikesBack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int totalMass = 0;
        for (int i = 0; i < N; i++) {  
            int rockMass = Integer.parseInt(br.readLine()) ;
            if (rockMass <= M) {
                totalMass += rockMass;
            }
        }

        System.out.println(totalMass);
    }
}
