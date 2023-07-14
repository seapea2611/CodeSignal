package Intro;

import java.util.Arrays;

public class Bai16 {
    boolean solution(int[] a, int[] b) {
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != b[i]){
                count++;
            }
        }
        int count1 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if(a[i] != b[i]){
                count1++;
            }
        }
        if((count == 0 || count == 2) && count1 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
