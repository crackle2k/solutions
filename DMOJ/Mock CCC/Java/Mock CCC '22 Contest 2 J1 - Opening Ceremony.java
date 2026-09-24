// Source: https://usaco.guide/general/io

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int F = input.nextInt();
        int M = input.nextInt();
        int B = input.nextInt();
        int tF = input.nextInt();
        int tM = input.nextInt();
        int tB = input.nextInt();

        System.out.println((tF + tM + tB) + " " + (F * tF + M * tM + B * tB));
	}
}
