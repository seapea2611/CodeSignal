package Core;

public class Bai43 {
    boolean solution(int n) {
        if(n == 1)
            return true;
        // chỉ kiếm tra các số bé hơn căn n vì căn n là số lớn nhất trong các số có thể lũy thừa được
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(check(n,i))
                return true;
        }
        return false;
    }
    // kiểm tra xem 1 số a có phải là 1 lũy thừa của b không
    boolean check(int a,int b){
        // đến khi a = 1 sẽ thoát vòng while ( tức là a chỉ chia cho b và chia hết => a là lũy thừa của b)
        while(a != 1) {
            if(a % b != 0)
                return false;
            a = a / b;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
