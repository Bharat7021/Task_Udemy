import java.util.*;

public class Solution {
    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        int temp = n;
        for (int i = nums1.length; i >= 0; i--) {
            if (nums1[i] == 0) {
                if (temp == -1) {
                    continue;
                }
                nums1[i] = nums2[temp];
                temp--;
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        solution(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        // code for taking array as input with spaces in between
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b[]=new int[a];
        // for (int i = 0; i < a; i++) {
        // b[i] = sc.nextInt();
        // }
    }
}
