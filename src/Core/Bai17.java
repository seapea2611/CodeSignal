package Core;

public class Bai17 {
    int solution(int n, int k) {
        return n & (~(1 << (k - 1)));
    }

    public static void main(String[] args) {
        Bai17 bai17 = new Bai17();
        System.out.println(bai17.solution(37,3));
    }
}
