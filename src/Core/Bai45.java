package Core;

import java.util.ArrayList;
import java.util.List;

public class Bai45 {
    int solution(int a0) {
        if(a0 == 1)
            return 2;
        List<Integer> list = new ArrayList<Integer>();
        while(!kiem_tra(a0,list)) {
            // nếu không nằm trong list thì thêm vào list vào tạo ra 1 số chuyển tiếp mới
            list.add(a0);
            a0 = chuyentiep(a0);
        }
        return list.size() + 1;
    }
    // kiểm tra 1 số có nằm trong list hay không
    boolean kiem_tra(int n, List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            if(n == list.get(i))
                return true;
        }
        return false;
    }
    // tạo ra 1 số chuyển tiếp của n bằng tổng bình phương các chữ số
    int chuyentiep(int n){
        int sum = 0;
        while(n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
