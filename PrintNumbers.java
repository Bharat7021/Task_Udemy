
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt(); // boolean binary
        print(n , x);
        sc.close();
    }
    private static void print(int n , int x) {
        if(x == 0){// decreasing order
            if(n == 0) return;
            System.out.print(n + " ");
            print(n-1, 0);
        }else{// increasing order
            if(n == 0) return;
            print(n-1, 1);
            System.out.print(n + " ");
        }
        
    }
}
