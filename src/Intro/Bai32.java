package Intro;

public class Bai32 {
    int solution(int[] a) {
        int len = a.length;
        int[] arr = new int[len];
        int sum = 0;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                sum += Math.abs(a[j] - a[i]);
            }
            arr[i] = sum;
            sum = 0;
        }
        int min = arr[0];
        int s = 0;
        for(int i = 1; i < len; i++) {
            if(arr[i] < min) {
                min = arr[i];
                s = i;
            }
        }
        return a[s];

    }


    public static void main(String[] args) {

    }
}
