import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            String i = sc.next();
            if(i.charAt(1)=='+'){
                x++;
            }
            else{
                x--;
            }
            n--;
        }
        System.out.println(x);
        sc.close();
    }
}
