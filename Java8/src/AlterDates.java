import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlterDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1); //2023-01-19T10:47:06.844850

        LocalDateTime localDateTime2 = localDateTime1.plusDays(1);
        System.out.println(localDateTime2); //2023-01-20T10:47:06.844850

        LocalDateTime localDateTime3 = localDateTime1.withMonth(9);
        System.out.println(localDateTime3); //2023-09-19T10:47:06.844850

        LocalDateTime localDateTime4 = localDateTime1.plus(Period.ofWeeks(1));
        System.out.println(localDateTime4); //2023-01-26T10:47:06.844850

        LocalDateTime localDateTime5 = localDateTime1.minus(Duration.ofHours(4));
        System.out.println(localDateTime5); //2023-01-19T06:47:06.844850
    }
}
