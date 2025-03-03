package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 : " + nowDate);
        System.out.println("지정 날짜 : " + localDate);

        //계산(불변)
        localDate = localDate.plusDays(10);
        System.out.println("지정 날짜 : " + localDate);
    }
}
