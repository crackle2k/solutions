import java.io.*;
import java.util.*;

public class MaxIsLast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Double.parseDouble(br.readLine()));
        }

        double highest = Collections.max(nums);
        nums.remove(highest);

        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%.2f %n", nums.get(i));
        }
        System.out.printf("%.2f %n", highest);

    }
}
