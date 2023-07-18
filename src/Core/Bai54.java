package Core;

public class Bai54 {
    boolean solution(String inputString) {
        String result = inputString.toLowerCase();
        int len = result.length();
        for(int i = 0; i < len / 2; i++) {
            if(result.charAt(i) != result.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }


}
