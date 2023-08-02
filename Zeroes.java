public class Zeroes {

    public static void setZeroes(int[][] matrix) {
        int a[][] = new int[2][Math.max(matrix[0].length, matrix.length)];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    a[0][i] = -1;
                    a[1][j] = -1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (a[0][i] == -1 || a[1][j] == -1) {
                    System.out.println(i + " " + j);
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int m[][] = { { 0, 1, 2, 0 }, { 2, 2, 3, 6 }, { 6, 4, 3, 8 } };
        setZeroes(m);
    }

}
