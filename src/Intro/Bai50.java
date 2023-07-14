package Intro;

public class Bai50 {
    int solution(String cell) {
        int count  = 0;
        if((cell.charAt(0) + 1 <= 'h') && (cell.charAt(1) + 2 <= '8'))
            count++;
        if((cell.charAt(0) + 1 <= 'h') && (cell.charAt(1) - 2 >= '1'))
            count++;
        if((cell.charAt(0) - 1 >= 'a') && (cell.charAt(1) + 2 <= '8'))
            count++;
        if((cell.charAt(0) - 1 >= 'a') && (cell.charAt(1) - 2 >= '1'))
            count++;
        if((cell.charAt(0) + 2 <= 'h') && (cell.charAt(1) + 1 <= '8'))
            count++;
        if((cell.charAt(0) + 2 <= 'h') && (cell.charAt(1) - 1 >= '1'))
            count++;
        if((cell.charAt(0) - 2 >= 'a') && (cell.charAt(1) + 1 <= '8'))
            count++;
        if((cell.charAt(0) - 2 >= 'a') && (cell.charAt(1) - 1 >= '1'))
            count++;
        return count;
    }

    public static void main(String[] args) {

    }
}
