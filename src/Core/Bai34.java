package Core;

public class Bai34 {
    int solution(int n, int m) {
        // Công thức mò được
        return m + n - 2 + ucln(n, m);
    }
    int ucln(int a,int b) {
        if(b == 0) return a;
        return ucln(b, a % b);
    }
}
