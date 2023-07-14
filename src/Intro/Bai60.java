package Intro;

public class Bai60 {
    boolean solution(int[][] grid) {
        int sum = 0, sum1 = 0, sum2 = 0;
        for(int i = 0; i < 9; i+=3) {
            for(int j = 0; j < 9; j+=3){
                for(int x = i; x <= i + 2; x++){
                    for(int y = j; y <= j + 2; y++){
                        sum += grid[x][y];
                    }
                }
                if(sum != 45)  return false;
                sum = 0;
            }
        }
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                sum1 += grid[i][j];
            }
            if(sum1 != 45)  return false;
            sum1 = 0;
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                sum2 += grid[j][i];
            }
            if(sum2 != 45)  return false;
            sum2 = 0;
        }
        if(grid[0][0] == grid[0][1])    return false;

        return true;
    }

    public static void main(String[] args) {

    }
}
