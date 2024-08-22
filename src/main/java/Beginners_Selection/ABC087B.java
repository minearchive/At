package Beginners_Selection;

import java.util.Scanner;

public class ABC087B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), x = scanner.nextInt();

        int success = 0;

        for (int d = 0; d <= a; d++) {
            for (int e = 0; e <= b; e++) {
                for (int f = 0; f <= c; f++) {
                    if (((d * 500) + (e * 100) + (f * 50)) == x) success++;
                }
            }
        }

        System.out.println(success);
    }
}
