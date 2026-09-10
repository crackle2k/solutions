// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int min = 100;
        int max = 0; 

        for (int i = 0; i < 4; i++) {
            int currentNumber = scanner.nextInt();

            if (currentNumber < min) {
                min = currentNumber;
            }
            
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
		
        System.out.println(min);
        System.out.println(max);
	}
}
