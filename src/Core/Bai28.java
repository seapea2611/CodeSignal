package Core;

public class Bai28 {
    int solution(String commands) {
        int count = 0;
        int countLR = 0;

        for(int i = 0; i < commands.length(); i++) {
            if(commands.charAt(i) == 'L' || commands.charAt(i) == 'R')
                countLR++;
            if(countLR % 2 == 0 && commands.charAt(i) == 'A') {
                count++;
                continue;
            }
            if(countLR % 2 == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
