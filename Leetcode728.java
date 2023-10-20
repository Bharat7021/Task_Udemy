import java.util.ArrayList;
import java.util.List;

public class Leetcode728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(self(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean self(int a){
        boolean r = true;
        int n = String.valueOf(a).length();
        int temp = 0, temp1 = a;
        for(int i = 0; i < n; i++){
            temp = a % 10;
            if(temp == 0) return false;
            r = r & (temp1 % temp == 0);
            a = a/10;
        }
        return r;
    }
}
