
public class Palindrome {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,2,1};
        System.out.println(check(a, 0, a.length - 1));
    }
    public static boolean check(int[] a, int s, int e){
        if(s > e) return true;
        if(a[s] == a[e]) return check(a, s+1, e-1);
        return false;
    }
}
