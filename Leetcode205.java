import java.util.HashMap;
import java.util.Map;

public class Leetcode205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length())
                return false;
            Map<Character, Character> m = new HashMap<>();
            Map<Character, Character> n = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (m.containsKey(s.charAt(i))) {
                    if (m.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                } else {
                    m.put(s.charAt(i), t.charAt(i));
                }
            }
            for (int i = 0; i < t.length(); i++) {
                if (n.containsKey(t.charAt(i))) {
                    if (n.get(t.charAt(i)) != s.charAt(i)) {
                        return false;
                    }
                } else {
                    n.put(t.charAt(i), s.charAt(i));
                }
            }
            return true;
        }
    }
}
