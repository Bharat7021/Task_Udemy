package Recursion;

public class CheckElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,10,11};
        System.out.println(presence(arr, arr.length-1,9));
    }
    public static boolean presence(int[] a, int i, int k){
        if(i == 0) return false;
        if(a[i] == k) return true;
        else return presence(a, i-1, k);
    }
}
