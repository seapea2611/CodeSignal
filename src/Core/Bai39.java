package Core;

public class Bai39 {
    int[] solution(int[] inputArray, int l, int r) {
        int index = r - l + 1;
        int[] result = new int[inputArray.length - index];
        for(int i = 0; i < inputArray.length; i++) {
            if(i < l) {
                result[i] = inputArray[i];
            }
            if(i > r) {
                result[i - index] = inputArray[i];
            }
        }
        return result;
    }

}
