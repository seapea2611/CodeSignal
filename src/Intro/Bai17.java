package Intro;

public class Bai17 {
    int solution(int[] a) {
        int move = 0;
        for(int i = 0; i < a.length - 1; i++) {
            while(a[i] >= a[i + 1]) {
                move += 1;
                a[i+1] += 1;
            }
        }

        return move;
    }

    public static void main(String[] args) {

    }
}
