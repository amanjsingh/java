import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ConvertDates {
    public static void main(String[] args) {
        Date date = new Date(2023-1900, 1-1, 1);
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        LocalDate localDate = zonedDateTime.toLocalDate();

        System.out.println(date); //Sun Jan 01 00:00:00 AST 2023
        System.out.println(instant); //2023-01-01T04:00:00Z
        System.out.println(zonedDateTime); //2023-01-01T00:00-04:00[America/Halifax]
        System.out.println(localDateTime); //2023-01-01T00:00
        System.out.println(localDate); //2023-01-01

        Calendar calendar = Calendar.getInstance();
        Instant instant1 = calendar.toInstant();
        ZonedDateTime zonedDateTime1 = instant1.atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime1 = zonedDateTime1.toLocalDateTime();
        LocalDate localDate1 = zonedDateTime1.toLocalDate();

        System.out.println(calendar);
        System.out.println(instant1); //2023-01-19T15:37:24.648Z
        System.out.println(zonedDateTime1); //2023-01-19T11:37:24.648-04:00[America/Halifax]
        System.out.println(localDateTime1); //2023-01-19T11:37:24.648
        System.out.println(localDate1); //2023-01-19
    }
}
