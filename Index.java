
public class Index {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,10,11};
        System.out.println(firstIndex(arr, 0,6));
        System.out.println(lastIndex(arr, arr.length-1,6));
    }
    public static int firstIndex(int[] a, int i, int k){
        if(i == a.length-1) return -1;
        if(a[i] == k) return i;
        else return firstIndex(a, i+1, k);
    }
    public static int lastIndex(int[] a, int i, int k){
        if(i == 0) return -1;
        if(a[i] == k) return i;
        else return lastIndex(a, i-1, k);
    }
}
