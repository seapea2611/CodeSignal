package Intro;

import java.util.ArrayList;
import java.util.List;

public class Bai49 {
    String solution(String s) {
        List<String> list = new ArrayList<String>();
        StringBuffer sBuffer = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            // thêm kí tự vào bufer
            sBuffer.append(s.charAt(i));
            // nếu là phần tử cuối thì cho vào list và thoát
            if(i == s.length() - 1) {
                list.add(sBuffer.toString());
                break;
            }
            // nếu phần tử tiếp theo khác phần tử đang xét thì thêm vào list vào reset lại bufer
            if(s.charAt(i) != s.charAt(i + 1))
            {
                list.add(sBuffer.toString());
                sBuffer = new StringBuffer();
            }
        }

        StringBuffer result = new StringBuffer();
        for(int i = 0; i < list.size(); i++) {
            // nếu phần tử chỉ có 1 phần tử thì thêm vào bufer kí tự
            if(list.get(i).length() == 1)
                result.append(list.get(i));
                // nếu k sẽ thêm độ dài và tên kí tự
            else {
                result.append(list.get(i).length());
                result.append(list.get(i).charAt(0));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
