
public class majorityElement {
    public static int maxProfit(int[] prices) {
        int profit = 0, temp = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                if (profit > temp) {
                    temp = profit;
                }
            }
        }
        // System.out.println(min);
        // for (int i = min + 1; i < prices.length; i++) {
        // profit = prices[i] - prices[min];
        // System.out.println(profit);
        // if (profit > temp) {
        // temp = profit;
        // System.out.println(temp);
        // }
        // }
        // System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        int a[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(a));
    }
}
