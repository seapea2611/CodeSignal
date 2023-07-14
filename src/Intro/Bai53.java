package Intro;

public class Bai53 {
    boolean solution(String time) {
        String[] a = time.split("[:]");
        int hour = Integer.parseInt(a[0]);
        int minutes = Integer.parseInt(a[1]);
        if((hour >= 0 && hour <= 23) && (minutes >= 0 && minutes <= 59))
            return true;
        return false;

    }

    public static void main(String[] args) {

    }
}
