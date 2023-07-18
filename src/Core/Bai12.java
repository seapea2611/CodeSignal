package Core;

public class Bai12 {
    boolean solution(int a, int b) {
        if(a > b)
            return true;
        else if(a == b)
            return false;
        else {
            if((b - a) % 2 ==0)
                return false;
            else
                return true;
        }
    }

}
