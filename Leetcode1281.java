public class Leetcode1281 {
    class Solution {
        public int subtractProductAndSum(int n) {
            int prod = 1, sum = 0;
            int t1 = 0;
            while (n > 0) {
                t1 = n % 10;
                prod *= t1;
                sum += t1;
                n /= 10;
            }
            return prod - sum;
        }
    }
}
