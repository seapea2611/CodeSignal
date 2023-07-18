package Core;

public class Bai38 {
    int[] solution(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for(int i = 0 ; i < result.length; i++) {
            if( i < a.length)
                result[i] = a[i];
            else result[i] = b[i - a.length];
        }
        return result;
    }


}
