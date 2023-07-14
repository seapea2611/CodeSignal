package Intro;

public class Bai6 {
    int solution(int[] statues) {
        int min = statues[0], max = statues[0];
        for(int i = 1; i < statues.length; i++){
            if(min > statues[i])
                min = statues[i];
            if(max < statues[i])
                max = statues[i];
        }
        return max - min - statues.length + 1;
    }

    public static void main(String[] args) {

    }
}
