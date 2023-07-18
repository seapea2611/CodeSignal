package Core;

public class Bai14 {
    boolean solution(int score1, int score2) {
        int a = max(score1,score2);
        int b = score1 + score2 - a;

        if(a < 6)
            return false;
        else if(a == 6) {
            if(b < 5) {
                return true;
            }
            else return false;
        }
        else {
            if(a == 7 && (b == 5 || b == 6))
                return true;
            return false;
        }
    }
    int max(int a, int b) {
        if(a > b)
            return a;
        return b;
    }

}
