import java.util.ArrayList;
import java.util.List;

public class Leetcode974 {
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0, j = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            System.out.println(sum);
            if (sum % k == 0) {
                count++;
            }
            if (i == nums.length - 1) {
                sum = 0;
                j++;
                i = -1 + j;
            }
            if (i == nums.length - 1 && j == nums.length - 1)
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = { 4, 5, 0, -2, -3, 1 };
        System.out.println(-5%5);
        System.out.println(subarraysDivByK(a, 5));
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.toArray();
    }
}
