package Core;

public class Bai33 {
    int solution(int candlesNumber, int makeNew) {
        int result = candlesNumber;
        while(candlesNumber >= makeNew) {
            result += candlesNumber / makeNew;
            candlesNumber = candlesNumber / makeNew + candlesNumber % makeNew;
        }
        return result;
    }

}
