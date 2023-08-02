import java.util.Stack;

public class Leetcode1209 {
    public class Pair {
        char first;
        int second;

        Pair(char f, int s) {
            first = f;
            second = s;
        }
    }

    class Solution {

        public String removeDuplicates(String s, int k) {
            Stack<Pair> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (st.empty() || st.peek().first != s.charAt(i)) {
                    System.out.print("A");
                    Pair p = new Pair((s.charAt(i)), 1);
                    st.push(p);
                } else {
                    System.out.print("B");
                    st.peek().second++;
                    int count = st.peek().second;
                    if (count == k) {
                        System.out.print("C");
                        st.pop();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!st.empty()) {
                int count = st.peek().second;
                while (count > 0) {
                    System.out.print("D");
                    sb.insert(0, st.peek().first);
                    count--;
                }
                st.pop();
            }
            return sb.toString();
        }
    }
}
