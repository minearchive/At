package Beginners_Selection;

import java.util.Scanner;

public class ABC081B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ints = new int[n];
        int possible = 0;
        boolean stop = false;

        int i = 0;
        while (scanner.hasNext()) {
            ints[i] = scanner.nextInt();
            i++;
        }

        while (true) {
            i = 0;
            for (int anInt : ints) {
                if (anInt % 2 == 1) stop = true;
                ints[i] = anInt / 2;
                i++;
            }
            if (stop) break;
            possible++;
        }

        System.out.println(possible);
    }

}
