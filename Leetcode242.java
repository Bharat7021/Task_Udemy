import java.util.Arrays;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        char sA[] = new char[n];
        char tA[] = new char[n];
        for(int i = 0; i < n; i++){
            sA[i] = s.charAt(i);
            tA[i] = t.charAt(i);
        }
        Arrays.sort(sA);
        Arrays.sort(tA);
        for(int i = 0; i < n; i++){
            if(sA[i] != tA[i]) return false;
        }
        return true;
    }
}
