public class Leetcode1342 {
    class Solution {
        public int numberOfSteps(int num) {
            int res = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                    num /= 2;
                    res++;
                } else {
                    num--;
                    res++;
                }
            }
            return res;
        }
    }
}
