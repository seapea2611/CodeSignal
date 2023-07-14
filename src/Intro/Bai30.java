package Intro;

public class Bai30 {
    int solution(int n, int firstNumber) {
        if(firstNumber < n / 2){
            return firstNumber + n / 2;
        }
        else {
            return firstNumber - n / 2;
        }
    }

    public static void main(String[] args) {

    }
}
