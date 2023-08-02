package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sdigit(n));
        sc.close();
    }
    public static int sdigit(int n){
        if(n == 0) return 0;
        return sdigit(n/10)+ n%10;
    }
}
