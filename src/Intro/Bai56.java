package Intro;

import java.util.Stack;

public class Bai56 {
    int solution(int product) {
        if(product == 0)
            return 10;
        if(product < 10) {
            return product;
        }
        int[] a = {9,8,7,6,5,4,3,2};
        int count = 0;
        Stack<Integer> st = new Stack<Integer>();
        int i = 0;
        for(i = 0; i < 8; i++) {
            // mỗi khhi chia hết cho 1 số, sẽ đẩy số vừa chia hết vào stack và tăng biến count và giảm i đi 1 để sau tăng i vẫn sẽ giữ nguyên.
            if(product % a[i] == 0){
                product /= a[i];
                st.push(a[i]);
                count++;
                i--;
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        if(count == 0 || product != 1){
            return -1;
        }
        return Integer.parseInt(sb.toString());

    }

    public static void main(String[] args) {

    }
}
