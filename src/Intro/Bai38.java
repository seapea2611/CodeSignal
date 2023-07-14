package Intro;

public class Bai38 {
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int day = 0;
        int height = 0;
        // khi chiều cao chưa đạt đến mức mong muốn
        while(height < desiredHeight) {
            // tăng chiều cao ban ngày
            height += upSpeed;
            day++;
            // nếu đạt đến ngưỡng thì break
            if(height >= desiredHeight)
                break;
            // nếu k thì trừ đi chiều cao ban đêm
            height -= downSpeed;
        }
        return day;
    }

    public static void main(String[] args) {

    }
}
