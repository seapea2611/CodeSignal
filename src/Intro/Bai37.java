package Intro;

public class Bai37 {
    int solution(int[] inputArray, int k) {
        int result = 0, sum = 0;
        // lặp các phần tử từ đầu đến phần tử cuối trừ đi k
        for(int i = 0; i <= inputArray.length - k; i++) {
            // duyệt từ phần tử i đến i + k - 1 để kiểm tra tổng k số liên tiếp
            for(int j = i; j < i + k; j++) {
                sum += inputArray[j];
            }
            // kiểm tra số lớn nhất
            if(result <= sum) {
                result = sum;
            }
            sum = 0;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
