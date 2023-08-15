
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,6,6,6,8,10,11};
        System.out.println(count(arr, 0, 6));
    }
    public static int count(int[] a, int i, int k){
        if(i == a.length) return 0;
        if(a[i] == k) return 1 + count(a, i + 1, k);
        return count(a, i + 1, k);
    }
}
