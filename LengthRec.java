
import java.util.Scanner;

public class LengthRec {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = new char[sc.nextInt()];
        System.out.println(len(c));
        sc.close();
    }
    public static int len(char[] c){
        return c.length;
    }
}
