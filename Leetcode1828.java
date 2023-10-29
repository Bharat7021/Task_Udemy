public class Leetcode1828 {
    class Solution {
        public int[] countPoints(int[][] points, int[][] queries) {
            int[] res = new int[queries.length];
            int cnt = 0;
            for (int i = 0; i < queries.length; i++) {
                cnt = 0;
                for (int j = 0; j < points.length; j++) {
                    if ((queries[i][0] - points[j][0]) * (queries[i][0] - points[j][0]) +
                            (queries[i][1] - points[j][1]) * (queries[i][1] - points[j][1]) <= queries[i][2]
                                    * queries[i][2])
                        cnt++;
                }
                res[i] = cnt;
            }
            return res;
        }
    }
}
