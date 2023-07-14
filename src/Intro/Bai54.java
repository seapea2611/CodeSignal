package Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai54 {
    int solution(String inputString) {
        // regular expression với số
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);
        int sum = 0;
        while(matcher.find()) {
            String word = matcher.group();
            sum += Integer.parseInt(word);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
