package Core;

public class Bai25 {
    int solution(int n) {
        int i = 1;
        // nếu i! < n nhỏ hơn thì tăng i lên
        while(factorial(i) < n) {
            i++;
        }
        //trả về i!
        return factorial(i);
    }
    // tính n!
    int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
