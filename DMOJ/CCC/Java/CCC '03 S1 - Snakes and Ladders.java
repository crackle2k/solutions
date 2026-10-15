import java.util.Scanner;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentPos = 1;
        while (sc.hasNextInt()) {
            int nextMove = sc.nextInt();

            if (nextMove == 0) {
                System.out.println("You Quit!");
                break;
            }

            int old = currentPos;
            currentPos = move(currentPos, nextMove);

            if (currentPos == 100) {
                System.out.println("You are now on square 100");
                System.out.println("You Win!");
                break;
            } else if (currentPos > 100) {
                currentPos = old;
                System.out.println("You are now on square " + currentPos);
            } else {
                System.out.println("You are now on square " + currentPos);
            }
        }

        sc.close();
    }

    public static int move(int pos, int move) {

        pos += move;

        if (pos == 99) {
            pos = 77;
        } else if (pos == 90) {
            pos = 48;
        } else if (pos == 54) {
            pos = 19;
        } else if (pos == 67) {
            pos = 86;
        } else if (pos == 40) {
            pos = 64;
        } else if (pos == 9) {
            pos = 34;
        }

        return pos;
    }
}
