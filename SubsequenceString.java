package Recursion;

import java.util.Scanner;

public class SubsequenceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), op = "";
        subs(s, op);
        sc.close();
    }

    public static void subs(String x, String o) {
        if (x.length() == 0) {
            System.out.println(o);
            return;
        }
        subs(x.substring(1), o + x.charAt(0));
        subs(x.substring(1), o);
    }
}
