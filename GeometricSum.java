package Recursion;

import java.util.Scanner;

public class GeometricSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(gm(n));
        sc.close();
    }
    public static double gm( double n){
        if(n == 0 ) return 1;
        return gm(n-1) + 1/(Math.pow(2,n));
    }
}
