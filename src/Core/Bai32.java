package Core;

public class Bai32 {
    int solution(int n) {
        int sochuso = String.valueOf(n).length();
        int somu = 0;
        for(int i = sochuso - 1; i > 0; i--) {
            String str = String.valueOf(n);
            // làm tròng xuống bằng cách trừ
            if(Character.getNumericValue(str.charAt(i)) < 5){
                n = (int) (n - Character.getNumericValue(str.charAt(i)) * Math.pow(10, somu));
            }
            // làm tròn lên bằng cách cộng
            else {
                n = (int) (n + (10 - Character.getNumericValue(str.charAt(i))) * Math.pow(10, somu));
            }
            somu++;
        }
        return n;
    }
}
