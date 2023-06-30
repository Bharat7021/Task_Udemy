import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
        // int res[] = new int[2]; ********||Own Approach||********
        // for(int i = 0; i<nums.length-1; i++){
        // for (int j = i +1; j< nums.length; j++){
        // if(nums[i]+nums[j]==target){
        // res[0] = i;
        // res[1] = j;
        // }
        // }
        // }
        // return res;
    }
}
