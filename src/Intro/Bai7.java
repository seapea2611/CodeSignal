package Intro;

public class Bai7 {
    boolean solution(int[] sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 0 && i < sequence.length - 2
                        && sequence[i - 1] >= sequence[i + 1]
                        && sequence[i] >= sequence[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
