package Implementation;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P10699_오늘날짜 {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        System.out.println("서울의 오늘 날짜를 YYYY-MM-DD 형식으로 출력 : ");
        System.out.println(simpleDateFormat.format(date));
    }
}
