package Core;

public class Bai46 {
    int solution(int current, int numberOfDigits) {
        // khi còn đủ mực để in
        while(1==1) {
            numberOfDigits -= sochuso(current);
            // sau khi đổ mực và không còn đủ mực để in
            if(numberOfDigits < sochuso(current))
                break;
            current += 1;
        }
        return current;
    }
    int sochuso(int n) {
        return String.valueOf(n).length();
    }
}
