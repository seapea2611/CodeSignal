package Core;

public class Bai16 {
    int[] solution(int lastNumberOfDays) {
        int a[] = {28, 30, 31};
        int b[] = {31};
        if( lastNumberOfDays == 30 || lastNumberOfDays == 28 || lastNumberOfDays == 29)
            return b;
        return a;
    }

}
