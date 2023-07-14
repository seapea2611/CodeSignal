package Intro;

public class Bai25 {
    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int len = inputArray.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = inputArray[i];
            if(inputArray[i] == elemToReplace)
                arr[i] = substitutionElem;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
