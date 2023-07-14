package Intro;

public class Bai26 {
    boolean solution(int n) {
        int a;
        while(n >= 1) {
            if(n % 2 != 0)
                return false;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
