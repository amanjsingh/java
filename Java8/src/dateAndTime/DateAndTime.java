package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class DateAndTime {
    public static void main(String[] args) {
//       LocalDate
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(1994,11,3);
        LocalDate localDate3 = LocalDate.of(2018, Month.JULY, 4);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

//       LocalTime
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(22, 51);
        System.out.println(localTime1);
        System.out.println(localTime2);

//       LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2018,7,4,8,0);
        LocalDateTime localDateTime3 = LocalDateTime.of(localDate1, localTime1);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);

//        MonthDay
        MonthDay monthDay = MonthDay.of(11,13);
        LocalDate localDate4 = monthDay.atYear(1994);
        System.out.println(monthDay);
        System.out.println(localDate4);

//        YearMonth
        YearMonth yearMonth = YearMonth.of(2018, Month.JULY);
        LocalDate localDate5 = yearMonth.atDay(4);
        System.out.println(yearMonth);
        System.out.println(localDate5);
    }
}