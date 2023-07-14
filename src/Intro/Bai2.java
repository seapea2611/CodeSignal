package Intro;

public class Bai2 {
    int solution(int year) {
        if(year % 100 == 0)
            return year / 100;
        return year / 100 + 1;
    }

    public static void main(String[] args) {

    }
}
