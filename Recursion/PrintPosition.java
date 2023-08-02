package Recursion;

public class PrintPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,10,11};
        print(arr, 0, 6);
    }
    public static void print(int[] a, int i, int k){
        if(a[i] == k) System.out.print(i + " ");
        if(i == a.length - 1) return;
        print(a, i + 1, k);
    }
}
