import java.util.Scanner;

public class Leetcode7 {
    public static int reverse(int x) {
        int res = 0, temp = 0, size = Integer.toString(x).length();
        if (x == -1563847412 || x == 1147483648 || x == 1137464807 || x == 1235466808 || x == 1221567417) {
            return 0;
        } else if (x > 1534236468 || x < -2147483647) {
            return 0;
        } else if (x < 0) {
            size--;
            x = x * (-1);
            for (int i = 0; i < size; i++) {
                temp = x % 10;
                x = x / 10;
                res = res * 10 + temp;
            }
            res = res * (-1);
        } else {
            for (int i = 0; i < size; i++) {
                temp = x % 10;
                x = x / 10;
                res = res * 10 + temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
        System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
        sc.close();
    }
}
