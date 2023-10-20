import java.util.Scanner;

public class A248Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += num(i);
        }
        System.out.println(res);
        sc.close();
    }

    public static int num(int n) {
        if (n < 248) {
            return 0;
        }
        int count2 = 0;
        int count4 = 0;
        int count8 = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2) {
                count2++;
            } else if (digit == 4) {
                count4++;
            } else if (digit == 8) {
                count8++;
            }
            n /= 10;
        }
        return (count2 > 0 && count2 == count4 && count8 == count4) ? 1 : 0;
    }
}
