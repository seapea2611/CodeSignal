package Core;

public class Bai27 {
    int solution(int a, int b, int n) {
        int sum = 0;
        while(n > 0) {
            sum += a*b;
            a++;
            b++;
            n--;
        }
        return sum;
    }

}
