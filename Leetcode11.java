public class Leetcode11 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxWater = 0;
        while (l < r) {
            int w = r - l;
            int h = Math.min(height[r], height[l]);
            int water = w * h;
            maxWater = Math.max(water, maxWater);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}
