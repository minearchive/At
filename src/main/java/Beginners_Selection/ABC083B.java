package Beginners_Selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC083B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();

        List<Integer> ints = new ArrayList<>();
        int total = 0;

        for (int i = 1; i < n + 1; i++) {
            for (char c : String.valueOf(i).toCharArray()) {
                ints.add(Integer.parseInt(String.valueOf(c)));
            }

            int added = 0;
            for (Integer anInt : ints) added += anInt;

            if (a <= added && added <= b) total += i;

            ints.clear();
        }

        System.out.println(total);
    }

}
