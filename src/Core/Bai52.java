package Core;

public class Bai52 {
    String solution(String noun) {
        StringBuffer sb = new StringBuffer();
        char[] result = new char[noun.length()];
        result[0] = noun.toUpperCase().charAt(0);
        for(int i = 1; i < noun.length(); i++) {
            result[i] = noun.toLowerCase().charAt(i);
        }
        for(int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }
        return sb.toString();
    }

}
