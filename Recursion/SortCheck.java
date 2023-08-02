package Recursion;

public class SortCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,10,11};
        System.out.println(chk(arr, arr.length-1));
    }
    public static boolean chk(int[] a, int i){
        if(i == 1) return true;
        if(a[i] <a[i-1]) return false;
        else chk(a,i-1);
        return true;
    }
}
