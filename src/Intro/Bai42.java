package Intro;

public class Bai42 {
    boolean solution(String bishop, String pawn) {
        int sum_bishop = Character.getNumericValue(bishop.charAt(0)) + Character.getNumericValue(bishop.charAt(1));
        int minus_bishop = Character.getNumericValue(bishop.charAt(0)) - Character.getNumericValue(bishop.charAt(1));

        int sum_pawn = Character.getNumericValue(pawn.charAt(0)) + Character.getNumericValue(pawn.charAt(1));
        int minus_pawn = Character.getNumericValue(pawn.charAt(0)) - Character.getNumericValue(pawn.charAt(1));

        if((sum_bishop == sum_pawn) || (minus_bishop == minus_pawn)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
