package dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String date = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(date);

        String formatStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(localDateTime);
        System.out.println(formatStyleDate);
    }
}
