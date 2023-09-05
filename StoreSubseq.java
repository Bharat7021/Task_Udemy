
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), op = "";
        List<String> st = new ArrayList<>();
        subs(s, op, st);
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }
        sc.close();
    }

    public static void subs(String x, String o ,List<String> s) {
        if (x.length() == 0) {
            s.add(o);
            return;
        }
        subs(x.substring(1), o + x.charAt(0),s);
        subs(x.substring(1), o,s);
    }
}
