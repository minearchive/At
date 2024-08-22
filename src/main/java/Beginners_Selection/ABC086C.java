package Beginners_Selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC086C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] current = new int[] { 0, 0 };

        int walked = 0;
        boolean failed = false;
        int n = scanner.nextInt();
        List<Integer> t = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            t.add(scanner.nextInt());
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }

        for (int i = 0; i < t.size(); i++) {
            if (!possible(t.get(i) - walked, current, new int[] { x.get(i), y.get(i) })) {
                failed = true;
                break;
            }
            walked = t.get(i);
            current[0] = x.get(i);
            current[1] = y.get(i);
        }

        System.out.println(failed ? "No" : "Yes");
    }

    public static boolean possible(int i, int[] current, int[] to) {
        int a = Math.abs(to[0] - current[0]) + Math.abs(to[1] - current[1]);
        return a % 2 == i % 2 && a <= i;
    }
}
