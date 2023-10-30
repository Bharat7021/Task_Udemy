public class Leetcode2574 {
    class Solution {
        public int[] leftRightDifference(int[] nums) {
            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                res[i] = Math.abs(leftSum(nums, i) - rightSum(nums, i + 1));
            }
            return res;
        }

        public int leftSum(int[] nums, int curr) {
            int res = 0;
            for (int i = 0; i < curr; i++) {
                res += nums[i];
            }
            return res;
        }

        public int rightSum(int[] nums, int curr) {
            int res = 0;
            for (int i = curr; i < nums.length; i++) {
                res += nums[i];
            }
            return res;
        }
    }
}
