package Core;

public class Bai8 {
    int solution(int min1, int min2_10, int min11, int s) {
        int sum = 0;
        if(s < min1) {
            sum = 0;
        }
        else if(s == min1)
            sum = 1;
        else if(s >= (min1 + min2_10) && s<= (min1 + min2_10 * 9)) {
            sum = 1 + (s - min1) / min2_10;
        }
        else {
            sum = 10 + (s - min1 - 9 * min2_10) / min11;
        }
        return sum;

    }
}
