import java.util.ArrayList;

public class Leetcode1313 {
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i = i + 2) {
                int n = nums[i];
                while (n > 0) {
                    arr.add(nums[i + 1]);
                    n--;
                }
            }
            int n = arr.size();
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = arr.get(i);
            }
            return res;
        }
    }
}
