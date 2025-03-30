package time;
import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now(); // UTC 기준이므로, 우리나라 시간보다 -9시간.
        System.out.println("now : " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from : " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart : " + epochStart);
        Instant epochStartPlus100 = Instant.ofEpochSecond(100);
        System.out.println("epochStartPlus100 : " + epochStartPlus100);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
