package dateAndTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Clocks {
    public static void main(String[] args) {
        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock1); //SystemClock[America/Halifax]

        Instant instant = clock1.instant();
        System.out.println(instant); //2023-01-16T20:09:55.820466Z

        Clock clock2 = Clock.systemUTC();
        System.out.println(clock2.instant()); //2023-01-16T20:09:55.822221Z

        Clock clock3 = Clock.offset(clock1, Duration.ofHours(10));
        System.out.println(clock3.instant()); //2023-01-17T06:09:55.822311Z
    }
}
