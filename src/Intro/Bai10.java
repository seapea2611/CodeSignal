package Intro;

public class Bai10 {

    int solution(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int common = 0;

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            common += Math.min(freq1[i], freq2[i]);
        }

        return common;
    }


    public static void main(String[] args) {

    }
}
