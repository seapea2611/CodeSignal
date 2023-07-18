package Core;

public class Bai10 {
    int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        int a = max(value1, value2);
        if(maxW >= weight1 + weight2)
            return value1 + value2;
        else if(maxW < weight1 && maxW < weight2)
            return 0;
        else if(maxW >= weight1){
            if(maxW < weight2)
                return value1;
            else return max(value1, value2);
        }
        else
            return value2;
    }
    int max(int a, int b) {
        if(a > b)
            return a;
        return b;
    }
}
