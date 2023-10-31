import java.util.ArrayList;

public class Leetcode1389 {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> newNums = new ArrayList<>();
            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                newNums.add(index[i], nums[i]);
            }
            for (int i = 0; i < res.length; i++) {
                res[i] = newNums.get(i);
            }
            return res;
        }
    }
}
