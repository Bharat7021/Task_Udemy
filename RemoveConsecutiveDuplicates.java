package Recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder st = new StringBuilder(s);
        System.out.println(removec(st, 1).toString());
        sc.close();
    }

    public static StringBuilder removec(StringBuilder x, int i) {
        if (i == x.length())
            return x;
        if (x.charAt(i) == x.charAt(i-1)) {
            x.deleteCharAt(i);
            return removec(x, i);
        } else
            return removec(x, i + 1);
    }
}
