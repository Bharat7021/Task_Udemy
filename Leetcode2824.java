import java.util.List;

public class Leetcode2824 {
    class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        int n = nums.size();
        int i = 0;
        int j = 1;
        while(i < j && i < n-1){
            while(j < n){
                if(nums.get(i) + nums.get(j) < target){
                    res++;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        return res;
    }
}
}
