package Recursion;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder st = new StringBuilder(s);
        System.out.println(remove(st, 'a', 0).toString());
        sc.close();
    }

    public static StringBuilder remove(StringBuilder x, char d, int i) {
        if (i == x.length())
            return x;
        if (x.charAt(i) == d) {
            x.deleteCharAt(i);
            return remove(x, d, i);
        } else
            return remove(x, d, i + 1);
    }
}
