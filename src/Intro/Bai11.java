package Intro;

public class Bai11 {
    boolean solution(int n) {
        int digit = 1;
        int n1 = n;
        while(n1 >= 10) {
            digit += 1;
            n1 = n1 / 10;
        }
        if(digit % 2 == 1) {
            return false;
        }
        else {
            int sum1 = 0, sum2 =0;
            for(int i = 0 ; i < (digit / 2) ; i++) {
                sum1 += n % 10;
                n = n / 10;
            }
            for(int i = digit / 2; i < digit ; i++) {
                sum2 += n % 10;
                n = n / 10;
            }
            return sum1 == sum2;
        }
    }

    public static void main(String[] args) {

    }
}
