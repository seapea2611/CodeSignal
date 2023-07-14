package Intro;

public class Bai24 {
    int[][] solution(boolean[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[row][col];
        boolean[][] extendedMatrix = new boolean[row + 2][col + 2];

        for (int i = 1; i <= row; i++) {
            System.arraycopy(matrix[i-1], 0, extendedMatrix[i], 1, col);
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                int count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int t = j - 1; t <= j + 1; t++) {
                        if (k == i && t == j) {
                            continue;
                        }
                        count += extendedMatrix[k][t] ? 1 : 0;
                    }
                }
                result[i - 1][j - 1] = count;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
