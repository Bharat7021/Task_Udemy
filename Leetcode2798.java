import java.util.Arrays;

public class Leetcode2798 {
    class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        if(hours[hours.length - 1] < target) return 0;
        int i = 0;
        while(hours[i] < target && i < hours.length){
            if(i < hours.length - 1) i++;
            else break;
        }
        return hours.length - i;
    }
}
}
