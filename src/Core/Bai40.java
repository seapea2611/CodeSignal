package Core;

public class Bai40 {
    boolean solution(int[] arr) {
        int len = arr.length;
        if(arr[0] != arr[len - 1])
            return false;
        if(len % 2 == 1)
            if(arr[len / 2] != arr[0])
                return false;
        if(len % 2 == 0)
            if(arr[(len / 2 - 1)] + arr[len / 2] != arr[0])
                return false;
        return true;
    }

}
