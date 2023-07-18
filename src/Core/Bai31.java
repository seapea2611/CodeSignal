package Core;

public class Bai31 {
    boolean solution(int n) {
        int count = 0;
        int count_end = 0;
        String str = String.valueOf(n);
        for(int i = str.length() - 1; i > 0; i--) {
            if(str.charAt(i) == '0')
                count++;
        }
        for(int i = str.length() - 1; i > 0; i--) {
            if(str.charAt(i) == '0')
                count_end++;
            else break;
        }
        if(count == count_end)
            return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
