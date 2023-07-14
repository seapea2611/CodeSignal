package Intro;

public class Bai14 {
    int[] solution(int[] a) {
        int sum1 = 0, sum2 =0;
        int arr[] = new int[2];
        for (int index = 0; index < a.length; index++) {
            if(index % 2 == 0) {
                sum1 += a[index];
            }
            else {
                sum2 += a[index];
            }
        }

        arr[0] = sum1;
        arr[1] = sum2;

        return arr;
    }

    public static void main(String[] args) {

    }
}
