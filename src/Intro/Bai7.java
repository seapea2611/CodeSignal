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
            }
        }
        for (int i = 0; i <sequence.length ; i++) {
            // 3,4,1,2
            // kiểm tra xem xóa 1 số có biến dãy thành tăng dần k?
            if (i < sequence.length - 3
                    && sequence[i] >= sequence[i + 2]
                    && sequence[i + 1] >= sequence[i + 3]) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {

    }
}
