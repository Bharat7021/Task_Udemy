import java.util.HashMap;
import java.util.Map;

public class Leetcode290 {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] w = s.split(" ");
            if (w.length != pattern.length()) {
                return false;
            }
            Map<Character, String> cToW = new HashMap<>();
            Map<String, Character> wToC = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = w[i];

                if (!cToW.containsKey(c)) {
                    cToW.put(c, word);
                }
                if (!wToC.containsKey(word)) {
                    wToC.put(word, c);
                }
                if (!cToW.get(c).equals(word) || !wToC.get(word).equals(c)) {
                    return false;
                }
            }
            return true;
        }
    }
}
