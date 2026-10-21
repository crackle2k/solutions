
import java.io.*;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            boolean swapped = false;

            for (int j = 0; j < N - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;

                    for (int num : nums) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
