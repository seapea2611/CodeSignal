package Intro;

public class Bai27 {
    boolean solution(String name) {
        char[] charArray = name.toCharArray();
        if(charArray[0] >= 48 && charArray[0] <= 57) {
            return false;
        }
        else {
            for(int i = 0; i < charArray.length; i++) {
                if(charArray[i] == 95 || (charArray[i] >= 48 && charArray[i] <= 57) || (charArray[i] >= 65 && charArray[i] <= 90) || (charArray[i] >= 97 && charArray[i] <= 122)) {

                }
                else {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {

    }
}
