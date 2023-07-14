package Intro;

public class Bai29 {
    boolean solution(String cell1, String cell2) {
        char[] arr1 = cell1.toCharArray();
        char[] arr2 = cell2.toCharArray();
        return ((arr1[0] + arr2[0] + arr1[1] + arr2[1]) % 2) ==0;
    }

    public static void main(String[] args) {

    }
}
