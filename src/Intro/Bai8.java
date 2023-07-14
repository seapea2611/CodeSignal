package Intro;

public class Bai8 {
    int solution(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    for(int x = i + 1; x < matrix.length; x++){
                        matrix[x][j] = 0;
                    }
                }

            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
