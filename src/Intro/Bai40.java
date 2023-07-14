package Intro;

public class Bai40 {
    String solution(String inputString) {
        // tạo 1 stirngbuffer rỗng
        StringBuffer sb = new StringBuffer("");
        // duyệt các kí tự
        for(int i = 0; i < inputString.length(); i++) {
            // nếu kí tự là số thêm vào bufer
            if(Character.isDigit(inputString.charAt(i))) {
                sb.append(inputString.charAt(i));
            }
            // nếu không thoát vòng lặp
            else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
