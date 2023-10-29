public class Leetcode1476 {
    class SubrectangleQueries {
        int[][] rect;

        public SubrectangleQueries(int[][] rectangle) {
            rect = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    rect[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return rect[row][col];
        }
    }

    public static void main(String[] args) {
        // int row = 0, row1 = 0, row2 = 0, col = 0, col1 = 0, col2 = 0, newValue = 0;
        // int[][] rectangle = new int[6][5];
        // SubrectangleQueries obj = new SubrectangleQueries(rectangle);
        // obj.updateSubrectangle(row1, col1, row2, col2, newValue);
        // int param_2 = obj.getValue(row, col);
    }

}
