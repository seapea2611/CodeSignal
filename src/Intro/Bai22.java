package Intro;

import java.util.Arrays;

public class Bai22 {
    int solution(int[] inputArray) {
        int a = 0;
        int jump = 1;
        int x =0;
        Arrays.sort(inputArray);
        while( a < inputArray[inputArray.length - 1] + 1) {
            if( a  == inputArray[x]) {
                jump++;
                a = 0;
                x = 0;
                continue;
            }
            // nếu lớn hơn checkpoint thì dịch checkpoint lên 1 index
            if(a > inputArray[x]) {
                x++;
                continue;
            }
            // bé hơn check point hiện tại thì nhảy
            a += jump;
        }

        return jump;
    }


    public static void main(String[] args) {

    }
}
