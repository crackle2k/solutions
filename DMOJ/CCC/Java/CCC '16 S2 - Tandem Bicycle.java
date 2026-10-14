import java.util.Arrays;
import java.util.Scanner;

public class TandemBicycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int question = sc.nextInt();
        int N = sc.nextInt();
        int[] dmojistan = new int[N];
        int[] pegland = new int[N];

        for (int i = 0; i < N; i++) {
            dmojistan[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            pegland[i] = sc.nextInt();
        }

        Arrays.sort(dmojistan);
        Arrays.sort(pegland);

        int sum = 0;
        if (question == 1) {
            for (int i = 0; i < N; i++) {
                if (dmojistan[i] > pegland[i]) { sum += dmojistan[i]; }
                else { sum += pegland[i]; }
            }
        } else {

            int[] temp = new int[pegland.length];
            int index = 0;
            for (int i = pegland.length - 1; i >= 0; i--) {
                temp[index] = pegland[i];
                index++;
            }
            pegland = temp;


            for (int i = 0; i < N; i++) {
                if (dmojistan[i] > pegland[i]) { sum += dmojistan[i]; }
                else { sum += pegland[i]; }
            }
        }
        
        System.out.println(sum);

        sc.close();
    }
}
