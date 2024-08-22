package Beginners_Selection;

import java.util.Scanner;

public class ABC085C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), y = scanner.nextInt();

        int success = 0;
        int a = 0, b = 0, c = 0;

        for (int i = n; i > 0; i--) {
            for (int ii = n - i; ii > 0; ii--) {
                for (int iii = n - i - ii; iii > 0; iii--) {
                    if (i * 10000 + ii * 5000 + iii * 1000 == y) success++;
                    a = i;
                    b = ii;
                    c = iii;
                }
            }
        }

        if (success == 0) System.out.println("-1 -1 -1");
        else System.out.println(a + " " + b + " " + c);
    }

}
