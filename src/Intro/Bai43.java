package Intro;

public class Bai43 {
    boolean solution(String inputString) {
        int[] count = new int[26];
        for(int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 25; i++) {
            if(count[i] < count[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
