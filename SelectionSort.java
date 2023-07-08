
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        selsort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
    public static void selsort(int[] arr){
        int i = 0, j = 0;
        for (i = 0; i < arr.length - 1; i++) {
            int  min = i;
            for (j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(arr[min] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
