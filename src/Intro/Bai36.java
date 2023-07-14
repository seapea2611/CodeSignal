package Intro;

public class Bai36 {
    int solution(String s) {
        // tạo 1 stringbuffer và thêm phần tử đầu tiên của string vào
        StringBuffer sb = new StringBuffer();
        sb.append(s.charAt(0));
        //kiểm tra xem kí tự thứ i có nằm ttrong StringBuffer hay không
        for(int i = 1; i < s.length(); i++) {
            // nếu chưa có thì thêm vào stringbuffer
            if(check(s.charAt(i), sb)) {
                sb.append(s.charAt(i));
            }
        }
        // trả về độ dài stringbuffer cũng là số kí tự khác biệt
        return sb.toString().length();
    }
    // hàm để check xem kí tự ch có nằm trong StringBuffer hay không
    boolean check(char ch, StringBuffer sb) {
        char[] character = sb.toString().toCharArray();
        for(int i = 0; i < character.length; i++) {
            if(ch == character[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
