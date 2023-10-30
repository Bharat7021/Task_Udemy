public class Leetcode2396 {
    class Solution {
        public boolean isStrictlyPalindromic(int n) {
            // StringBuilder sb = new StringBuilder();
            int t = n;
            for (int i = 2; i < n - 1; i++) {
                t = n;
                while (t > 0) {
                    n = t % i;
                }
            }
            return true;
        }

        public boolean isPalindrome(String str) {
            String rev = "";
            boolean ans = false;

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev)) {
                ans = true;
            }
            return ans;
        }
    }
}
