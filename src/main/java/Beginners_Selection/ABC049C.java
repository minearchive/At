package Beginners_Selection;

import java.util.Scanner;

public class ABC049C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        String replaced = s.replaceAll("eraser", "").replaceAll("erase", "").replaceAll("dreamer", "").replaceAll("dream", "");

        if (!replaced.isEmpty()) System.out.println("NO");
        else System.out.println("YES");
    }

}
