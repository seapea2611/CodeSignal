package Intro;

public class Bai45 {
    String solution(String st) {
        StringBuffer sb = new StringBuffer(st);
        int sokytu = 1;
        if(check(st)){
            return st;
        }
        else {
            while(0 < 1) {
                // thêm các kí tự đầu tiên vào cuối chuỗi
                for(int i = sokytu - 1; i >= 0; i--) {
                    sb.append(st.charAt(i));
                }
                // nếu chưa đói xứng thì tăng số ký tự cần thêm lên 1
                if(!check(sb.toString())){
                    sb= new StringBuffer(st);
                    sokytu++;
                }
                else break;
            }
            return sb.toString();
        }
    }
    // kiểm tra xem có phải chuỗi đối xứng
    boolean check(String s) {
        int len = s.length();
        for(int i = 0; i < len / 2; i++) {
            if(s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
