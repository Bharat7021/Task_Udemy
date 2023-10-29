public class Leetcode2114 {
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int mx = 0;
            for (int i = 0; i < sentences.length; i++) {
                mx = Math.max(mx, countSpaces(sentences[i]));
            }
            return mx;
        }

        public int countSpaces(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }
            return count + 1;
        }
    }
}
