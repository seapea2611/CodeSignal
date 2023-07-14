package Intro;

import java.util.ArrayList;
import java.util.List;

public class Bai47 {
    boolean solution(String inputString) {
        String[] a = inputString.split("[-]");
        // nếu kí tự cuối cùng là dấu - thì return false
        if((inputString.charAt(inputString.length() - 1) == '-'))
            return false;
        // phòng trường hợp có 2 dấu -- liên tiếp trở lên
        if(a.length != 6)
            return false;
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < a.length; i++) {
            if(a[i] != "")
                list.add(a[i]);
        }
        // nếu list không đủ 6 phần tử hoặc các phần tử k đủ 2 kí tự đều return false
        for (String s : list) {
            if(s.length() != 2)
                return false;
            // kiểm tra xem 2 kí tự có nằm trong khoảng đã cho không
            if(!check(s.charAt(0)) || !check(s.charAt(1)))
                return false;
        }
        return true;
    }
    boolean check(char ch) {
        return (Character.isDigit(ch)) || (Character.isLetter(ch) && ch >= 'A' && ch <= 'F');
    }

    public static void main(String[] args) {

    }
}
