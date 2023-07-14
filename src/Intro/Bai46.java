package Intro;

import java.util.Arrays;

public class Bai46 {
    int solution(int[] votes, int k) {
        int len = votes.length;
        Arrays.sort(votes);
        int count = 0;
        if(k == 0 && (votes[len - 1] > votes[len -2])) {
            return 1;
        }
        else {
            for(int i = 0; i < votes.length; i++) {
                if(votes[i] + k > votes[votes.length - 1])
                    count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {

    }
}
