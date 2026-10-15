import java.util.Scanner;

public class SecretInstructions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String last = "";

        while (true) {

            String line = sc.nextLine();
            if (line.equals("99999")) {
                break;
            }

            

            String end = "" + line.charAt(2) + line.charAt(3) + line.charAt(4);
            int remain = Integer.parseInt(end);

            if ((Integer.parseInt(String.valueOf(line.charAt(0))) + Integer.parseInt(String.valueOf(line.charAt(1)))) == 0) {
                System.out.println(last + " " + remain);
            } else if ((Integer.parseInt(String.valueOf(line.charAt(0))) + Integer.parseInt(String.valueOf(line.charAt(1)))) % 2 == 0) {
                last = "right";
                System.out.println(last + " " + remain);
            } else if ((Integer.parseInt(String.valueOf(line.charAt(0))) + Integer.parseInt(String.valueOf(line.charAt(1)))) % 2 != 0) {
                last = "left";
                System.out.println(last + " " + remain);
            }

        }

        sc.close();
    }
}
