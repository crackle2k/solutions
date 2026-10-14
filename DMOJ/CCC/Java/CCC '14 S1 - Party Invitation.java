import java.util.Scanner;

public class PartyInvitation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int rounds = sc.nextInt();
        int[] friends = new int[K];

        for (int i = 0; i < K; i++) {
            friends[i] = i + 1;
        }

        for (int i = 0; i < rounds; i++) {
            int count = friends.length;
            int removal = sc.nextInt();
            for (int j = 1; j <= friends.length; j++) {
                if (j % removal == 0) {
                    friends[j - 1] = 0;
                    count--;
                }
            }
            int[] newFriends = new int[count];
            int index = 0;
            for (int j = 0; j < friends.length; j++) {
                if (friends[j] != 0) {
                    newFriends[index] = friends[j];
                    index++;
                }
            }
            friends = newFriends;
        }

        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != 0) {
               System.out.println(friends[i]);
            }
        }

        sc.close();
    }
}
