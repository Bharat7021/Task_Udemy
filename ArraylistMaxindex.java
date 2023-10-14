import java.util.*;
public class ArraylistMaxindex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == 0) a[i] = sum * (-1);
            sum = sum + a[i];
            if(sum == 0) count++;
        }
        System.out.print(count);
        sc.close();
    }
}
