package dateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
    public static void main(String[] args) {
        Period period1 = Period.of(1,1,1);
        System.out.println(period1); //P1Y1M1D

        Period period2 = Period.ofDays(10);
        System.out.println(period2); //P10D

        LocalDate localDate1 = LocalDate.of(2022, 1, 1);
        LocalDate localDate2 = LocalDate.now();
        Period period3 = Period.between(localDate1, localDate2);
        Period period4 = Period.between(localDate2, localDate1);
        System.out.println(period3); //P1Y18D
        System.out.println(period4);  //P-1Y-18D
        System.out.println(period3.getDays()); //18

        long noOfDaysBetweenDates = ChronoUnit.DAYS.between(localDate1,localDate2);
        System.out.println(noOfDaysBetweenDates); //383
    }
}
