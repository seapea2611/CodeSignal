package Core;

public class Bai15 {
    boolean solution(boolean young, boolean beautiful, boolean loved) {
        if(young == true && beautiful == true && loved == false)
            return true;
        if(loved == true && (young == false || beautiful == false))
            return true;
        return false;
    }

}
