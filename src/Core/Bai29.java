package Core;

public class Bai29 {
    int solution(int param1, int param2) {
        int a,b;
        if(String.valueOf(param1).length() - String.valueOf(param2).length() >= 0) {
            a = param1;
            b = param2;
        }
        else {
            a = param2;
            b = param1;
        }
        int n = Math.abs(String.valueOf(param1).length() - String.valueOf(param2).length());
        StringBuffer sb = new StringBuffer();
        // thêm phần chữ số bị dôi ra
        for(int i = 0; i < n; i++) {
            sb.append(String.valueOf(a).charAt(i));
        }

        for(int i = n; i < String.valueOf(a).length(); i++) {
            sb.append((Character.getNumericValue(String.valueOf(a).charAt(i)) +
                    Character.getNumericValue(String.valueOf(b).charAt(i - n))) % 10);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Bai29 bai29 = new Bai29();
        System.out.println(bai29.solution(756,4500));
    }
}
