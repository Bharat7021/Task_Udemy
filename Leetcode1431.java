import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> res = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < candies.length; i++) {
                max = Math.max(max, candies[i]);
            }
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies < max) {
                    res.add(false);
                } else {
                    res.add(true);
                }
            }
            return res;
        }
    }
}
