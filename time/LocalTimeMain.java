package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 10, 30);
        System.out.println("오늘 시간 : " + nowTime);
        System.out.println("지정 시간 : " + localTime);

        //계산(불변)
        localTime = localTime.plusSeconds(30);
        System.out.println("지정 시간 : " + localTime);
    }
}
