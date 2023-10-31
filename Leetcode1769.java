import java.util.ArrayList;

public class Leetcode1769 {
    class Solution {
        public int[] minOperations(String boxes) {
            ArrayList<Integer> l = new ArrayList<>();
            int n = boxes.length();
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                if (boxes.charAt(i) == '1') {
                    l.add(i);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l.size(); j++) {
                    res[i] += Math.abs(i - l.get(j));
                }
            }
            return res;
        }
    }
}
