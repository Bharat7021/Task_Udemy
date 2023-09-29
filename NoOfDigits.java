
import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit(n));
        sc.close();
    }
    public static int digit(int x){
        if(x == 0) return 0;
        return digit(x/10)+1;
    }
}
