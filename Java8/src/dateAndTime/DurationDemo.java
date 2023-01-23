package dateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) {
        Duration duration1 = Duration.of(2, ChronoUnit.DAYS);
        System.out.println(duration1); //PT48H

        Duration duration2 = Duration.ofHours(5);
        System.out.println(duration2); //PT5H

        LocalTime localTime1 = LocalTime.of(15, 0);
        LocalTime localTime2 = LocalTime.now();
        Duration duration3 = Duration.between(localTime1, localTime2);
        Duration duration4 = Duration.between(localTime2, localTime1);
        System.out.println(duration3); //PT-4H-21M-47.815376S
        System.out.println(duration4); //PT4H21M47.815376S
    }
}
