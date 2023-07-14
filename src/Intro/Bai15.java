package Intro;

import java.util.ArrayList;
import java.util.List;

public class Bai15 {
    String[] solution(String[] picture) {
        int x = picture[0].length() + 2;
        String[] arr = new String[picture.length + 2];
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < picture.length + 2; i++) {
            if(i == 0) {
                for (int index = 0; index < x; index++) {
                    sb.append("*");
                }
                list.add(sb.toString());
            }
            else if(i == picture.length + 1) {
                sb= new StringBuffer();
                for (int index = 0; index < x; index++) {
                    sb.append("*");
                }
                list.add(sb.toString());
            }
            else {
                sb = new StringBuffer();
                for (int index = 0; index < 3; index++) {
                    if(index == 0 || index == 2 ) {
                        sb.append("*");
                    }
                    else {
                        sb.append(picture[i - 1]);
                    }
                }
                list.add(sb.toString());
            }
        }

        for (int index = 0; index < list.size(); index++) {
            arr[index] = list.get(index);
        }

        return arr;
    }

    public static void main(String[] args) {
        Bai15 bai15 = new Bai15();
        String[] picture = {"abc", "ded"};
        System.out.println(bai15.solution(picture));
    }
}
