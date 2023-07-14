package Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai52 {
    String solution(String text) {
        // biểu mẫu chính quy
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        // lọc
        Matcher matcher = pattern.matcher(text);

        String result = "";
        int max = 0;
        while(matcher.find()) {
            String word = matcher.group();
            if(max < word.length())
            {
                max = word.length();
                result = word;
            }
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
