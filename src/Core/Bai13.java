package Core;

public class Bai13 {
    boolean solution(int a, int b, int c) {
        if(a + b == c)
            return true;
        if(a - b == c)
            return true;
        if(a / b == c && a % b ==0)
            return true;
        if(a * b == c)
            return true;
        return false;
    }

}
