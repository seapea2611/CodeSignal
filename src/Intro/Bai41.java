package Intro;

public class Bai41 {
    int solution(int n) {
        int count = 0;
        if(n / 10 == 0)
            return 0;
        // nếu còn lơn hơn 10 thì số n = số chuyển tiếp của nó
        while(n >= 10) {
            n = chuyentiep(n);
            count++;
        }
        return count;
    }
    // hàm để tính tổng các chữ số của 1 số => số mới
    int chuyentiep(int n) {
        int result = 0;
        while(n >= 1) {
            result += (n % 10);
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
