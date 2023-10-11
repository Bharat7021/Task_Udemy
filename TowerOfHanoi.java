
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tow(n, 'A', 'B', 'C');
        sc.close();
    }

    public static void tow(int n, char s, char h, char d) {
        if (n == 0)
            return;
        tow(n - 1, s, d, h);
        System.out.println("Moving Disc " + n + " from " + s + " to " + d);
        tow(n - 1, h, s, d);
    }
}
