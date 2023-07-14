package Intro;

public class bai58 {
    String solution(String code) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < code.length(); i+=8) {
            // tách từng 8 bit, và có thể tách nếu các bit cuối k đủ 8
            String buffString = code.substring(i, Math.min(i + 8, code.length()));
            int a = Integer.parseInt(buffString, 2);
            char character = (char) a;
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
