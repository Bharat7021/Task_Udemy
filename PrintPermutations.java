package Recursion;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        permute(sb, 0);
        sc.close();
    }
    public static void permute(StringBuilder x ,int i) {
        if(i == x.length()){
            System.out.println(x.toString());
            return;
        }
        for (int j = i; j < x.length(); j++) {
            char y = x.charAt(i);
            x.setCharAt(i, x.charAt(j));
            x.setCharAt(j, y);//Swap 1
            permute(x, i+1);
            y = x.charAt(i);
            x.setCharAt(i, x.charAt(j));
            x.setCharAt(j, y);//Swap 2
        }
    }
}
