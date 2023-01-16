import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneAndDate {
    public static void main(String[] args) {
//        for(String zoneId : ZoneId.getAvailableZoneIds()){
//            System.out.println(zoneId);
//        }

        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("US/Pacific");
        
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime1);
        
        ZonedDateTime zonedDateTime2 = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime2);

        ZonedDateTime zonedDateTime3 = ZonedDateTime.now();
        ZoneId myZone = zonedDateTime3.getZone();
        System.out.println(myZone);
    }
}
