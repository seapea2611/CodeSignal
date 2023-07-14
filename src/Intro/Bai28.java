package Intro;

public class Bai28 {
    String solution(String inputString) {
        char[] arr = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'z') {
                arr[i] = 'a';
            }
            else {
                arr[i] = (char)(arr[i] + 1); }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
