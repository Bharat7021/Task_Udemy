
public class ReplaceCharacter {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'a', 'v', 'c', 'a'};
        replace(arr, 0, 'c', 'x');
        System.out.println(arr.toString());
    }
    public static void replace(char[] a, int i, char k, char x){
        if(i == a.length) return;
        if(a[i] == k) a[i] = x; replace(a, i + 1, k, x);
        replace(a, i + 1, k, x);
    }
}
