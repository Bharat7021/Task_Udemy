
import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zeroes(n));
        sc.close();
    }
    public static int zeroes(int n){
        if(n == 0) return 0;
        int i = zeroes(n/10);
        if(n%10 == 0) return 1+i;
        else return i;
    }
}
