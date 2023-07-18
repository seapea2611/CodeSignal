package Core;

public class Bai4 {
    int solution(int nCols, int nRows, int col, int row) {
        return ((nCols+1) - col) * (nRows - row);
    }

}
