package Intro;

public class Bai31 {
    int solution(int deposit, int rate, int threshold) {
        double m = deposit;
        int year = 0;
        double r = 1 + rate / 100.0;
        while(m < threshold){
            m = m * r;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {

    }
}
