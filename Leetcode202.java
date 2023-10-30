public class Leetcode202 {
    class Solution {
        public boolean isHappy(int n) {
            if (n == 1 || n == 7) {
                return true;
            }
            while (n > 9) {
                int total = 0;
                while (n > 0) {
                    total += Math.pow(n % 10, 2);
                    n /= 10;
                }
                n = total;
                if (n == 1 || n == 7) {
                    return true;
                }
            }
            return false;
        }
    }
}
