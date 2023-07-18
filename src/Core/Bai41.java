package Core;

public class Bai41 {
    int[] solution(int[] arr) {
        int len = arr.length;
        if(len % 2 == 1)
            return arr;
        int[] res = new int[len -1];
        for(int  i = 0; i < res.length; i++) {
            if(i < res.length / 2)
                res[i] = arr[i];
            else if(i == res.length / 2)
                res[i] = arr[len / 2 - 1] + arr[len / 2];
            else
                res[i] = arr[i + 1];
        }
        return res;
    }

}
