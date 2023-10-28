public class Leetcode1470 {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int x = n;
        for(int i = 0; i < nums.length - 1; i += 2){
            res[i] = nums[n - x];
            res[i+1] = nums[n];
            n++;
        }
        return res;
    }
}
}
