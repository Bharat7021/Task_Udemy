package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(sum(array, array.length-1));
    }
    public static int sum(int[] a, int n){
        if(n == 0) return a[0];
        return sum(a,n-1) + a[n];
    }
}
