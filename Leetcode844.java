import java.util.Stack;

public class Leetcode844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stackS.push(c);
            } else if (!stackS.isEmpty()) {
                stackS.pop();
            }
        }
        for (char c : t.toCharArray()) {
            if (c != '#') {
                stackT.push(c);
            } else if (!stackT.isEmpty()) {
                stackT.pop();
            }
        }
        return stackS.equals(stackT);
    }
}
