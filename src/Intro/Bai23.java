package Intro;

public class Bai23 {
    int[][] solution(int[][] image) {
        int len = image.length;
        int lent = image[0].length;
        int[][] a = new int[len - 2][lent - 2];
        int sum = 0;

        for(int i = 0; i < len - 2; i++ ) {
            for(int j = 0; j < lent -2 ; j++) {

                for(int x = i; x < i + 3; x++) {
                    for(int y = j; y < j + 3; y++) {
                        sum += image[x][y];
                    }
                }

                a[i][j] = sum / 9;
                sum = 0;
            }
        }

        return a;

    }

    public static void main(String[] args) {

    }
}
