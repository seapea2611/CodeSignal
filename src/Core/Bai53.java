package Core;

public class Bai53 {
    boolean solution(String inputString) {
        String str1 = inputString.substring(0, inputString.length()/2 );
        String str2 = inputString.substring(inputString.length()/2, inputString.length());
        return str1.equals(str2);
    }

}
