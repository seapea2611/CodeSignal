package Intro;

public class Bai3 {
    boolean solution(String inputString) {
        String b = "";
        for(int i = inputString.length() - 1; i >= 0; i-- ){
            b += inputString.charAt(i);
        }
        if(inputString.equals(b))
            return true;

        return false;
    }

    public static void main(String[] args) {

    }
}
