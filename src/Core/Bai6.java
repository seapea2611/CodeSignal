package Core;

public class Bai6 {
    int solution(int n, int firstNumber) {
        if(firstNumber < n / 2)
            return firstNumber + n / 2;
        return firstNumber - n / 2;
    }

}
