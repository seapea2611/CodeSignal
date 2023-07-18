package Core;

public class Bai11 {
     int solution(int a, int b, int c) {
        if(a - b != 0) {
            if(a - c == 0)
                return b;
            else
                return a;
        }
        return c;
    }

}
