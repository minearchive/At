package Beginners_Selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABC088B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> integers = new ArrayList<>();
        int score = 0;

        while (scanner.hasNextInt()) {
            integers.add(scanner.nextInt());
        }

        List<Integer> ints = integers.stream().sorted(Comparator.comparing(i -> i)).sorted(Comparator.reverseOrder()).toList();

        int i = 0;
        for (int integer : ints) {
            if (i % 2 == 1) score -= integer;
            else score += integer;

            i++;
        }

        System.out.println(score);
    }

}
