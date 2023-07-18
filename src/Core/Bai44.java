package Core;

public class Bai44 {
    int solution(int n) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i < n; i++){
            int x = i;
            // đến khi tổng bé hơn n thì ta cộng biến tổng thêm x và tăng x mỗi lần lặp
            while(sum < n){
                sum += x;
                x++;
                // nếu bắt gặp sum = n thì tăng biến sum lên và break
                if(sum == n){
                    count++;
                    break;
                }
            }
            sum = 0;
        }
        return count;
    }


}
