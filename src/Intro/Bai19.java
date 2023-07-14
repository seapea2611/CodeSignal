package Intro;

public class Bai19 {
    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight)
                && Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight);
    }

    public static void main(String[] args) {

    }
}
