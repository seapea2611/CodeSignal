package Intro;

import java.util.ArrayList;
import java.util.List;

public class Bai21 {
    boolean solution(String inputString) {
        String[] a = inputString.split("[.]");
        List<String> list = new ArrayList<>();
        for (String string : a) {
            if(string != "")
                list.add(string);
        }

        int[] ip = new int[4];
        if(list.size() != 4)
            return false;
        else {
            for(int i = 0; i < 4; i++) {
                try {
                    ip[i] = Integer.parseInt(a[i]); }
                catch(NumberFormatException e) {
                    return false;
                }
                if(ip[i] < 0 || ip[i] >= 256)
                    return false;
                if(!a[i].equals(String.valueOf(ip[i])))
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
