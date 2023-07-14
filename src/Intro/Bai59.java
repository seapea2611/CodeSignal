package Intro;

public class Bai59 {
    int[][] solution(int n) {
        int[][] res = new int[n][n];
        int rowStart = 0,  rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        int num = 1;
        while(num <= n*n) {
            for(int i = colStart; i <= colEnd; i++) {
                res[rowStart][i] = num;
                num++;
            }
            rowStart++;
            for(int i = rowStart; i <= rowEnd; i++) {
                res[i][colEnd] = num;
                num++;
            }
            colEnd--;
            for(int i = colEnd; i >= colStart; i--) {
                res[rowEnd][i] = num;
                num++;
            }
            rowEnd--;
            for(int i = rowEnd; i >= rowStart; i--) {
                res[i][colStart] = num;
                num++;
            }
            colStart++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
