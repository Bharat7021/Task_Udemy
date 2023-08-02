import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int spaces;
        for (int i = 1; i <= m; i++) {
            spaces = (m - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
