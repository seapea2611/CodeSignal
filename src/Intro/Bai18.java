package Intro;

public class Bai18 {
    boolean solution(String inputString) {
        int[] a = new int[26];

        for (char c : inputString.toCharArray()) {
            a[c - 'a']++;
        }

        int check = 0;
        for (int index = 0; index < a.length; index++) {
            if(a[index] % 2 == 1) {
                check++;
            }
        }
        return check <= 1;
    }

    public static void main(String[] args) {

    }
}
