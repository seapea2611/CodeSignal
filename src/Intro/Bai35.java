package Intro;

public class Bai35 {
    char solution(String inputString) {
        char result = '0';
        //vòng lặp duyệt các kí tự
        for(int i = 0; i < inputString.length(); i++) {
            //nếu kí tự thứ i là số thì gắn vào resulf và thoát vòng lặp
            if(Character.isDigit(inputString.charAt(i))){
                result = inputString.charAt(i);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
