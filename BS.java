public class BS {
    public static int indexElement(int[] array, int x) {
        int s = 0, e = array.length - 1;
        if(array[e]<x) return 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (x < array[mid]) {
                e = mid - 1;
            } else if (x > array[mid]) {
                s = mid + 1;
            } else {
                return mid+1;
            }
            Math.
        }
        // int res = search(array, x, s, e);
        if(array[s] == x) return s+1;
        return s; 
    }


    // private static int search(int[] array, int x, int s, int e) {
    // int resu = (s+e)/2;
    // if(array[(s+e)/2] == x){
    // return resu;
    // }else if(array[(s+e)/2] > x){
    // e=((s+e)/2)-1;
    // resu = search(array, x, s, e);
    // }else{
    // s=((s+e)/2)+1;
    // resu = search(array, x, s, e);
    // }
    // return resu;
    // }
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 23, 45, 67, 89, 93, 103, 123, 143, 152, 176 };
        int target = 1234;
        System.out.println(indexElement(a, target));
    }
}
