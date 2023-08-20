import java.util.Scanner;

public class Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int m = sc.nextInt();
        char[] c = new char[9];
        System.out.println(Math.sqrt(Math.pow(2, 31)));
        System.out.println(c[0]);
        for (int i = 1; i <= q; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == q || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}