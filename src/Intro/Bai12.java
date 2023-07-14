package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai12 {

    int[] solution(int[] a) {
        int length = a.length;
        List<Integer> strListHuman = new ArrayList<>();

        for(int i = 0; i < length; i++ )
        {
            if(a[i] != -1) {
                strListHuman.add(a[i]);
            }
        }

        int human[] = new int[strListHuman.size()];
        for(int i = 0; i < strListHuman.size(); i++)
        {
            human[i] = strListHuman.get(i);
        }
        Arrays.sort(human);

        int x = 0;

        for(int i = 0; i < length; i++)
        {
            if(a[i] != -1) {
                a[i] = human[x++];
            }
        }

        return a;
    }

    public static void main(String[] args) {

    }
}
