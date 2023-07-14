package Intro;

import java.util.ArrayList;
import java.util.List;

public class Bai9 {
    String[] solution(String[] inputArray) {
        int x = inputArray.length;
        List<String> strList = new ArrayList<>();

        int[] a = new int[x];
        // tìm chiều dài max
        int max = inputArray[0].length();
        for(int i = 1; i < x; i++)
        {
            if(max < inputArray[i].length()) {
                max = inputArray[i].length();
            }
        }

        for(int i = 0; i < x; i++)
        {
            if(inputArray[i].length() == max) {
                strList.add(inputArray[i]);
            }
        }
        String[] newArr = strList.toArray(new String[strList.size()]);
        return newArr;
    }

    public static void main(String[] args) {

    }
}
