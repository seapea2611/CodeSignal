package Intro;

public class Bai20 {
    int solution(int[] inputArray) {
        int[] a = new int[inputArray.length - 1];

        for (int index = 0; index < a.length; index++) {
            a[index] = Math.abs(inputArray[index] - inputArray[index + 1]);
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
