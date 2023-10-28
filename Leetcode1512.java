public class Leetcode1512 {
    class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i = 0, j = 1, res = 0;
        while(i < j && j < nums.length){
            if(nums[i] == nums[j]) res++;
            if(j == nums.length - 1){
                i++;
                j = i+1;
            }
            else{
                j++;
            }
        }
        return res;
    }
}
}
