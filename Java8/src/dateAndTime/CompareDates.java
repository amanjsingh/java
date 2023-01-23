package dateAndTime;

import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2023,1,1,8,0);

        System.out.println(localDateTime1); //2023-01-16T16:16:30.883243
        System.out.println(localDateTime2); //2023-01-01T08:00

        System.out.println(localDateTime1.compareTo(localDateTime2)); //15
        System.out.println("isAfter : "+localDateTime1.isAfter(localDateTime2)); //true
        System.out.println("isBefore : "+localDateTime1.isBefore(localDateTime2)); //false
        System.out.println("isEqual : "+localDateTime1.isEqual(localDateTime2)); //false
    }
}
