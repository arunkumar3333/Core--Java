package Java8Features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class dateAndTime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(time);
//        ZoneId s=ZoneId.of("Asia/Kolkata");
//        System.out.println(s);
        LocalDate date=LocalDate.now();
        System.out.println(date);

        for(String zone: ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }
    }
}
