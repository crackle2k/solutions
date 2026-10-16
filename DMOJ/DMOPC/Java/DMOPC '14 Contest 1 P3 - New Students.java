import java.util.Scanner;

public class NewStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initial = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < initial; i++) {
            sum += sc.nextInt();
        }

        int transfering = sc.nextInt();
        int students = initial;

        for (int i = 0; i < transfering; i++) {
            sum += sc.nextInt();
            students++;

            double currentAverage = (double) sum / students;
            System.out.printf(java.util.Locale.US, "%.3f%n", currentAverage);
        }

        sc.close();
    }
}
