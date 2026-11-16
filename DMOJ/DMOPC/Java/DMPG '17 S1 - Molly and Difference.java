import java.io.*;
import java.util.*;

public class MollyAndDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            if (diff < lowest) { lowest = diff; }
        }

        out.println(lowest);
        out.flush();
    }
}
