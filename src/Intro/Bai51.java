package Intro;

import java.util.ArrayList;
import java.util.List;

public class Bai51 {
    int solution(int n) {
        int x = n;
        List<Integer> list = new ArrayList<Integer>();
        List<String> number = new ArrayList<String>();
        int sochuso = 0;
        while(x > 0) {
            sochuso++;
            x /= 10;
        }
        while(sochuso > 0) {
            list.add((int) (n / Math.pow(10, sochuso - 1)));
            n %= Math.pow(10, sochuso - 1);
            sochuso--;
        }
        if(list.size() == 1)
            return list.get(0);

        for(int i = 0; i < list.size(); i++) {
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < list.size(); j++) {
                if(j != i)
                    sb.append(list.get(j));
            }
            number.add(sb.toString());
        }
        int max = Integer.parseInt(number.get(0));

        for(int i = 1; i < number.size(); i++) {
            if(max < Integer.parseInt(number.get(i)))
                max = Integer.parseInt(number.get(i));
        }
        return max;

    }

    public static void main(String[] args) {

    }
}
