// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
        Scanner myInput = new Scanner(System.in);
        int pCount = 0;

        for (int i = 0; i < 5; i++) {
            String currentSection = myInput.nextLine();

            if (currentSection.equals("P")) {
                pCount++;
            }
        }

        System.out.println(pCount);

	}
}
