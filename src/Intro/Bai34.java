package Intro;

public class Bai34 {
    int[] solution(int[] inputArray, int k) {
        int a = inputArray.length / k;
        int n = 0;
        // tạo 1 mảng ít hơn mảng cũ số các phần tử chia hết cho k
        int[] arr = new int[inputArray.length - a];
        for(int i = 0; i < arr.length; i++) {
            // nếu là phần tử k chia hết cho k thì phẩn tử arr = phần tử mảng input dịch sang trái n phần tử
            if((i + n + 1) % k != 0) {
                arr[i] = inputArray[i + n];
            }
            // nếu k thì tăng n lên 1 và dịch phẩn tử arr = phần tử mảng input dịch sang trái n phần tử
            else {
                n++;
                arr[i] = inputArray[i + n];
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
