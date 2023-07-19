
import java.util.Scanner;

public class PrintAndReversePrint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,6,6,6,8,10,11};
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        parp(arr, i, 0);
        sc.close();
    }
    public static void parp(int[] a, int i, int d){
        if(i == 1){
            if(d == a.length) return;
            System.out.print(a[d] + " ");
            parp(a, i, d+1);
        }else if(i == 0){
            if(d == a.length) return;
            parp(a, i, d+1);
            System.out.print(a[d] + " ");
        }
    }
}
