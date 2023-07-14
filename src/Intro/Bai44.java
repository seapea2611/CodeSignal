package Intro;

public class Bai44 {
    String solution(String address) {
        StringBuffer sb = new StringBuffer();
        int index = address.lastIndexOf('@');
        for(int i = index + 1; i < address.length(); i++) {
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
