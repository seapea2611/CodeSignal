package Core;

import java.util.HashSet;

public class Bai26 {
    int solution(int n, int l, int r) {
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = l; i <= r; i++ ) {
            int k = n - i;
            // nếu số k trong khoảng (l,r) và set chưa chứa i và k thì thêm cặp này vào set và tăng biến đếm
            if(k >= l && k <= r && !set.contains(k) && !set.contains(i)){
                count++;
                set.add(k);
                set.add(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
